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
public class Problem7point20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);
        
        for (double e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * selsctionSort sorts array in ascending order
     */
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            // Find the maximum in the list[i+1...list.length]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMax] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
