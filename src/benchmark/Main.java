package me.chasebrown;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("finalLayout.txt"));
        ArrayList<String> data1 = new ArrayList<>();
        while (reader.hasNext()) {
            data1.add(reader.next());
        }

        FileWriter writer = new FileWriter(new File("finalReport.txt"));
        for (String s : data1) {
            writer.write(s);
        }
    }

}
