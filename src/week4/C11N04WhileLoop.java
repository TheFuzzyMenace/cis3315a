/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C11N04WhileLoop {

    public static Integer min(ArrayList<Integer> userInput) {
        if (userInput.size() == 0) {
            return null;
        }
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < userInput.size(); i++) {
            if (userInput.get(i) < minNum) {
                minNum = userInput.get(i);
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<>();
        System.out.print("Enter a sequence of numbers ending wih 0: \n");
        int number = sc.nextInt();
        while (number != 0) {
            userInput.add(number);
            number = sc.nextInt();
        }
        System.out.println("The minimum value is: " + C11N04WhileLoop.min(userInput));
    }

}
