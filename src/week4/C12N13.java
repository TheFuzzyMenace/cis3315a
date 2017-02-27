/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C12N13 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintWriter writer = new PrintWriter("C12N13.txt", "UTF-8");
        writer.println("These Are Word. I am saying words. I will count these words.");
        writer.close();
        
        System.out.println("The number of words is: " + C12N13.countWords());
        System.out.println("The number of lines is: " + C12N13.countLines());
        System.out.println("The number of chars is: " + C12N13.countChars());

    }

    public static int countWords() throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("C12N13.txt");
        BufferedReader br = new BufferedReader(fr);

        String words = br.readLine();
        int wordCount = 0;
        while (words != null) {
            String[] parts = words.split(" ");
            for (String w : parts) {
                wordCount++;
            }
            words = br.readLine();
        }
        return wordCount;

    }

    public static int countLines() throws FileNotFoundException, IOException {
        FileReader fr2 = new FileReader("C12N13.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        String lines = br2.readLine();
        int lineCount = 0;
        while (lines != null) {
            String[] parts2 = lines.split("\\.");
            for (String w : parts2) {
                lineCount++;
            }
            lines = br2.readLine();
        }

        return lineCount;

    }

    public static int countChars() throws FileNotFoundException, IOException {
        FileReader fr3 = new FileReader("C12N13.txt");
        BufferedReader br3 = new BufferedReader(fr3);
        String chars = br3.readLine();
        int charCount = 0;
        for (int i = 0; i < chars.length(); i++) {

            if (chars.toLowerCase().charAt(i) >= 'a' && chars.toLowerCase().charAt(i) <= 'z') {
                charCount++;
            }
        }

        return charCount;
    }
}
