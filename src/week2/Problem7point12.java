/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class Problem7point12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        System.out.println("Enter 10 numbers (press enter after each): ");
        for (int a = 0; a < x.length; a++) {
            x[a] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Problem7point12.reversed(x)));
    }

    public static int[] reversed(int[] x) {
        int[] reversed = new int[x.length];

        for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {
            reversed[j] = x[i];
        }
        return reversed;
    }
}
