/*
Combines 2 Strings.
 */
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeremiah
 */
public class C11N14 {
    
    public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(list2);
        
        return combined;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int count2 = 1;
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Enter the first three strings: ");
        for(int i = 0; i < 3; i++){
            System.out.print("String " + count + ":  ");
            list1.add(sc.nextLine());
            count++;      
        }
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter the second three strings: ");
        for(int i = 0; i < 3; i++){
            System.out.print("String " + count2 + ":  ");
            list2.add(sc.nextLine());
            count2++;
        }
        System.out.println("The first ArrayList is " + list1);
        System.out.println("The second ArrayList is " + list2);
        System.out.println("The combined ArrayList is: " + C11N14.union(list1, list2));
    }
}
