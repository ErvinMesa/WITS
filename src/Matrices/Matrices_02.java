package Matrices;

public class Matrices_02 {
    public static void main(String[] args) {
        String[][] TicTacToe = new String[][]
                    {
                        {"X","O","X"},
                        {"O","O","X"},
                        {"X","X","O"}
                    };

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        System.out.print("[ROW 0]");
        System.out.print("["+TicTacToe[0][0]+"]");
        System.out.print("["+TicTacToe[0][1]+"]");
        System.out.print("["+TicTacToe[0][2]+"]");
        System.out.println();
        System.out.print("[ROW 1]");
        System.out.print("["+TicTacToe[1][0]+"]");
        System.out.print("["+TicTacToe[1][1]+"]");
        System.out.print("["+TicTacToe[1][2]+"]");
        System.out.println();
        System.out.print("[ROW 2]");
        System.out.print("["+TicTacToe[2][0]+"]");
        System.out.print("["+TicTacToe[2][1]+"]");
        System.out.print("["+TicTacToe[2][2]+"]");
        System.out.println();
    }
}
