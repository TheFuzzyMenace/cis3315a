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
public class Problem6point37 {

    public static String format(int number, int width) {
        
        int length = String.valueOf(number).length();
        String widthToString = "";
        String numberString = Integer.toString(number);

        for (int i = 0; i < width - length; i++) {
            if (width > length) {
                
                widthToString += "0";
                numberString = Integer.toString(number);
            }
        }
        return widthToString + numberString;
    }
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a width: ");
        int width = sc.nextInt();
        
        System.out.println(Problem6point37.format(number, width));
        

    }

}
