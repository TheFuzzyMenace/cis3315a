/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class C13N16 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int[] userInput = new int[4];
        System.out.println("Enter numerator and denominators of two fractions.");
        System.out.println("For example: 3/4 and 1/5 would be entered as: 3 4 1 5");
        System.out.print ("Enter them now: ");
        for(int i = 0; i < userInput.length; i++){
        userInput[i] = sc.nextInt();
        }
        System.out.println("\n The Fractions Added are: " + C13N16.addRat(userInput));
        System.out.println("\n The Fractions Subtracted are: " + C13N16.subRat(userInput));
        System.out.println("\n The Fractions Multiplied are: " + C13N16.multRat(userInput) + "\n");
    }

    public static String addRat(int[] userInput) {

        int num1 = userInput[0] * userInput[3];
        int denom = userInput[1] * userInput[3];
        int num2 = userInput[2] * userInput[1];
        int finalNum = num1 + num2;
        String result = finalNum + "/" + denom;
        return result;
    }

    public static String subRat(int[] userInput) {
        int num1 = userInput[0] * userInput[3];
        int denom = userInput[1] * userInput[3];
        int num2 = userInput[2] * userInput[1];
        int finalNum = num1 - num2;
        String result = finalNum + "/" + denom;
        return result;
    }

    public static String multRat(int[] userInput) {
        int finalNum = userInput[0] * userInput[2];
        int finalDenom = userInput[1] * userInput[3];
        String result = finalNum + "/" + finalDenom;
        return result;
    }
    
}
