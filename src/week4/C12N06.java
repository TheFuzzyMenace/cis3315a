/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C12N06 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
       try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (hex.charAt(i) != 'F'
                    && hex.charAt(i) != '0' && hex.charAt(i) != '1'
                    && hex.charAt(i) != '2' && hex.charAt(i) != '3'
                    && hex.charAt(i) != '4' && hex.charAt(i) != '5'     
                    && hex.charAt(i) != '6' && hex.charAt(i) != '7'
                    && hex.charAt(i) != '8' && hex.charAt(i) != '9'
                    && hex.charAt(i) != 'A' && hex.charAt(i) != 'B'
                    && hex.charAt(i) != 'C' && hex.charAt(i) != 'D' 
                    && hex.charAt(i) != 'E') {
                throw new NumberFormatException("String is not a hex string");
            } else {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else{
            return ch - '0';
        }
    }
}
