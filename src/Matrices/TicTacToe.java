package Matrices;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] Board = new String[3][3];

        //Set every cell to " "
        for(int i = 0;i < Board.length;i++){
            for (int j=0;j<Board[0].length;j++){
                Board[i][j]=" ";
            }
        }

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < Board.length;i++){
            System.out.print("[ROW "+i+"]");
            for(int j = 0;j < 3;j++){
                System.out.print("["+Board[i][j]+"]");
            }
            System.out.println();
        }

        System.out.println("Enter row");
        int userInputX = input.nextInt();
        System.out.println("Enter col #");
        int userInputY = input.nextInt();

        //SET ROW number userInputX and COL number userInputY to "O"
        Board[userInputX][userInputY] = "O";

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < Board.length;i++){
            System.out.print("[ROW "+i+"]");
            for(int j = 0;j < 3;j++){
                System.out.print("["+Board[i][j]+"]");
            }
            System.out.println();
        }
    }
}
