//Jacob Rogers
//CS_123P
//May 3, 2023

import java.io.*;

import java.util.*;



public class LineNumberOutput {



	public static void main(String[] args) {

	   

		BufferedReader reader;

		BufferedWriter writer;

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Input file name : ");

		String input = sc.next();

		System.out.println("Enter Output file name : ");

		String output = sc.next();

		

		int i=1;

		

		try {

		  File fout = new File(output);

	    FileOutputStream fos = new FileOutputStream(fout);

			

			reader = new BufferedReader(new FileReader(input));

			writer = new BufferedWriter(new OutputStreamWriter(fos));

			

			String line = reader.readLine();

			

			while (line != null) {

				writer.write("/* "+ i +" */ " + line);

				writer.newLine();

				line = reader.readLine();

				i++;

			}

			reader.close();

			writer.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}


