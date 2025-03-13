/*
Name: Kayla Van Curen
Date: 5/7/2023
Class: CS 123
Project: PA 14
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberingLinesinFile {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inputFileName = scnr.nextLine();
        System.out.print("Enter output file name: ");
        String outputFileName = scnr.nextLine();
        File file = new File(inputFileName);
        try {
            Scanner fin = new Scanner(file);
            PrintWriter pw = new PrintWriter(outputFileName);
            int lineNumber = 1;
            while (fin.hasNextLine()) {
                pw.println("/* " + lineNumber + " */ " + fin.nextLine());
                lineNumber++;
            }
            pw.flush();
            pw.close();
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(file.getAbsolutePath() + " does not exists!");
        }
    }
}