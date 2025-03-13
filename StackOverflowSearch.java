import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONObject;

public class StackOverflowSearch {
    public static void main(String[] args) {
        try {
            // Define the search parameters
            String query = "IndexOutOfBoundsException";
            String tags = "java";
            String site = "stackoverflow";
            int pageSize = 10; // Number of results to retrieve

            // Construct the API URL
            String apiUrl = String.format(
                "https://api.stackexchange.com/2.3/search?order=desc&sort=activity&intitle=%s&tagged=%s&site=%s&pagesize=%d",
                URLEncoder.encode(query, "UTF-8"),
                URLEncoder.encode(tags, "UTF-8"),
                URLEncoder.encode(site, "UTF-8"),
                pageSize
            );

            // Create a connection to the API
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept-Encoding", "gzip");

            // Check the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse the JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONArray items = jsonResponse.getJSONArray("items");

                // Print the titles and links of the retrieved questions
                for (int i = 0; i < items.length(); i++) {
                    JSONObject item = items.getJSONObject(i);
                    String title = item.getString("title");
                    String link = item.getString("link");
                    System.out.println("Title: " + title);
                    System.out.println("Link: " + link);
                    System.out.println();
                }
            } else {
                System.out.println("Error: Received HTTP response code " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
