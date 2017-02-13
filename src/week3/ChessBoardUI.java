
package week3;

import java.util.Scanner;

/**
 *
 * @author Jeremiah Zellers
 */
public class ChessBoardUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean gameOver = false;
        ChessBoard myBoard = new ChessBoard();

        System.out.println(myBoard);

        outterLoop:
        while (!gameOver) {
            if (count % 2 == 0) {
                System.out.println("Player: WHITE.\n");
            } else {
                System.out.println("Player: BLACK.\n");
            }
            while (true) {
                System.out.println("Would you like to move or quit?");
                System.out.println("Press 1 to play. Press 2 to quit. ");
                String choice = sc.nextLine();
                if (choice.equals("1")) {
                    break;
                } else if (choice.equals("2")) {
                    System.out.println("\nThere's No Shame In Admitting Defeat.\n");
                    break outterLoop;
                } else{
                    System.out.println("Invalid Selection. Press only 1 or 2.");
                }
            }
            System.out.println("Move From : (ROW  space COLUMN) ");
            int rowFrom = sc.nextInt();
            int colFrom = sc.nextInt();
             
            System.out.println("Move To: (ROW space COLUMN) ");
            int rowTo = sc.nextInt();
            int colTo = sc.nextInt();
            
            myBoard.move(rowFrom, colFrom, rowTo, colTo);
            System.out.println("\n");
            System.out.println(myBoard);
            count++;

        }

    }
}