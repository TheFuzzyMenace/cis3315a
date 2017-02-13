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
public class Problem5point46 {
    public static void main(String[] args) {
        
        String reversed = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter word to be reversed: ");
        String word = sc.nextLine();
        
        
        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        System.out.println("The word reversed is: " + reversed);
    }
    
    
    
}
