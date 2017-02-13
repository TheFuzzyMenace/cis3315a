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
public class Problem5point47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
        String isbn = sc.nextLine();

        if (isbn.length() != 12) {
            System.out.println(isbn + "is an invalid input.");
        } else {
            int total = 0;
            for (int i = 0; i < isbn.length(); i++) {
                int toInt = Integer.parseInt(isbn.substring(i, i+1));
                if ((i + 1) % 2 == 0) {
                    toInt *= 3;
                    total += toInt;
                }
            }
                int checksum = 10 - (total % 10);
                if(checksum == 10){
                    checksum = 0;
                }
                
                  System.out.println("The ISBN-13 number is: " + isbn + checksum );
                
            }

                
            }
        }


    

