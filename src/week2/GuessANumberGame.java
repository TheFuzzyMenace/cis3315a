/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GuessANumberGame {
            public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain == true) {
            int compNum = rand.nextInt(10) + 1;
            System.out.print("Pleae choose a number between 1 and 10: ");
            int userNum = sc.nextInt();

            while (userNum != compNum) {
                if (userNum < 1 || userNum > 10) {
                    System.out.println("Invalid. Only Enter numbers between"
                            + "1 (inclusive) and 10 (inclusive");
                    userNum = sc.nextInt();
                } else if (userNum > compNum) {
                    System.out.println("No match. Too HIGH. Try again: ");
                    userNum = sc.nextInt();
                } else if (userNum < compNum) {
                    System.out.println("No match. Too LOW. Try again: ");
                    userNum = sc.nextInt();
                }
            }
            System.out.println("Numbers Match! The winning nuber was "
                    + compNum + " Play again? (y/n)");

            if (sc.nextLine().equalsIgnoreCase("y")) {
                playAgain = true;
            } else if (!sc.nextLine().equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }

    }
    
}
    

