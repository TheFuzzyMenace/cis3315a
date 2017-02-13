/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class Problem5point49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String words1 = sc.nextLine();
        String words = words1.replaceAll(" ", "");
        int vowel = 0;
        int consonants = 0;
        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) == ('a') || words.charAt(i) == ('A') ||
               words.charAt(i) == ('e') || words.charAt(i) == ('E') ||
               words.charAt(i) == ('i') || words.charAt(i) == ('I') ||
               words.charAt(i) == ('o') || words.charAt(i) == ('O') ||
               words.charAt(i) == ('u') || words.charAt(i) == ('U') ||
               words.charAt(i) == ('y') || words.charAt(i) == ('Y')
            && words.charAt(i) != (' ')){
                vowel++;
            }else{
                consonants++;
                }
        
    }
        System.out.println("The number of vowels is: " + vowel);
        System.out.println("The number of consonants is: " + consonants);
    
}
}
