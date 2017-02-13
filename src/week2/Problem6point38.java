package week2;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jeremiah
 */
public class Problem6point38 {

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomUpperCaseLetter(){
    return getRandomCharacter('A', 'Z'); 
    
    }
    public static int getRandomInteger(){
        
        Random rand = new Random(); 
        int nums = rand.nextInt(10);
        return nums;
    }
    
        public static void main(String[] args) {

         int upperLetters = 200;
         int numbers = 200;
         int numbersPerLine = 10;

       
        for (int i = 0; i < upperLetters; i++) {
            if (i % numbersPerLine == 0) {
                System.out.println("\n");
            }
            System.out.print(Problem6point38.getRandomUpperCaseLetter());
        }

      
        for (int j = 0; j < numbers; j++) {
            if (j % numbersPerLine == 0) {
                System.out.println("\n");
            }
            System.out.print(Problem6point38.getRandomInteger());
            
        }
            System.out.println("\n");
    }
}
