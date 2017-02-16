/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C11N11 {

    public static void sort(ArrayList<Integer> userInput) {
        Collections.sort(userInput);
        Collections.reverse(userInput);
        System.out.print("The sorted ArrayList is: " + userInput + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<>();
        int count = 1;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + count + ":  ");
            userInput.add(sc.nextInt());
            count++;
        }
        sort(userInput);
    }

}
