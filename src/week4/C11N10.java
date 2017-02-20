/*
Reverses an Array
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C11N10 {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static ArrayList<String> reversed(ArrayList<String> userInput) {
        Collections.reverse(userInput);
        return userInput;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> userInput = new ArrayList<>();
        int count = 1;
        System.out.println("Enter 5 Strings.");
        for (int i = 0; i < 5; i++) {
            System.out.print("String " + count + ":  ");
            userInput.add(sc.nextLine());
            count++;

        }
        System.out.println("The ArrayList reversed is: " + C11N10.reversed(userInput));

    }

}
