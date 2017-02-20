/*
Returns the Product of an Array List.
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C11N12 {

    public static double multiply(ArrayList<Double> userInput) {
        int product = 1;
        for(int i = 0; i < userInput.size(); i++){
            product *= userInput.get(i);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> userInput = new ArrayList<>();
        int count = 1;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + count + ":  ");
            userInput.add(sc.nextDouble());
            count++;
        }
        System.out.println("The product of the ArrayList is: " + C11N12.multiply(userInput));
    }

}
