/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C12N03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] randomArr = new int[120];

        boolean oob = true;
        while (oob) {
            System.out.print("Enter an index (1 - 120):  ");
            int userIndex = sc.nextInt();
            if (1 <= userIndex && 120 >= userIndex) {
                for (int i = 0; i < randomArr.length; i++) {
                    randomArr[i] = rand.nextInt(120 + 1);
                    if (userIndex == i) {
                        System.out.print("The Number at Index " + userIndex + " is:  " + randomArr[i] + "\n");
                        oob = false;
                    }
                }
            } else if (userIndex < 1 || userIndex > 120) {
                System.out.println("Out of Bounds. Try Again.\n");
            }
        }
    }
}
