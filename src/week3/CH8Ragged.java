/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *  An Example of a "Ragged" array - meaning..:
 * You set a fixed number of rows from the beginning, but columns can be any
 * amount at any time. 
 * 
 * @author Jeremiah Zellers
 */
public class CH8Ragged {

    public static void main(String[] args) {

//        int[row][column]
        int[][] triangleArray = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5},
            {3, 4, 5},
            {4, 5},
            {5, 0}
        };

        System.out.println("0,0 = " + triangleArray[0][0]);
        System.out.println("0,1 = " + triangleArray[0][1]);
        System.out.println("1,0 = " + triangleArray[1][0]);
        System.out.println("4,0 = " + triangleArray[4][1]);

//        Another type of Array
//You only need to know how many rows.. columns do not matter.
        int[][] ta = new int[5][];

        //row           //column of 5 elements
        ta[0] = new int[5];
        ta[1] = new int[4];

        //Best way to print this is wtih nested for loop
        for (int row = 0; row < triangleArray.length; row++) {
            for (int column = 0; column < triangleArray[row].length; column++) {
                System.out.print(triangleArray[row][column] + " ");
            }
            System.out.println("");
        }
    }

}


