/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author Jeremiah 
 */
public class CH8N01 {
    
    public static double[][] createArray(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows: ");
        int inputRows = sc.nextInt();
        System.out.println("Enter how many columns: ");
        int inputColumns = sc.nextInt();
        
        double[][] m = new double[inputRows][inputColumns];
        System.out.println("Enter a " + inputRows + " by " + inputColumns + " matrix: ");
        for (int row = 0; row < inputRows; row++) {
            for (int col = 0; col < inputColumns; col++) {
                m[row][col] = sc.nextDouble();
            }
    }
        return m;
    }
    public static double sumRow(double[][] m, int rowIndex) {

            double sum = 0;
            for (int col = 0; col < 4; col++) {
                sum += m[rowIndex][col];
            } 
            return sum;
        }

    public static void main(String[] args) {
        double[][] matrix = createArray();
        for(int row = 0; row < matrix.length; row++){
            System.out.println("The sum of elements at row " + row + 
                    " is: " + sumRow(matrix, row));
        }
        

    }

}