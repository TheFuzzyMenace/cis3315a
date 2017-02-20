/*
sorts and Array List and finds minimum value
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C11N04ForLoop {
    public static Integer min(ArrayList<Integer> userInput){
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < userInput.size(); i++){
            if(userInput.get(i) < minNum){
                minNum = userInput.get(i);
            }
        }
        return minNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<>();
        System.out.print("How many numbers would you like to enter:  ");
        int choice = sc.nextInt();
        int count = 1;
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < choice; i++){
            System.out.print("Number " + count + ":  ");
            userInput.add(sc.nextInt());
            count++;
        }
        System.out.println("The minimum number is: " + C11N04ForLoop.min(userInput));
    }
    
}
