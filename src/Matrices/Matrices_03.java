package Matrices;

public class Matrices_03 {
    public static void main(String[] args) {
        String[][] TicTacToe = new String[][]
                    {
                        {"X","O","X"},
                        {"O","O","X"},
                        {"X","X","O"}
                    };

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < TicTacToe.length;i++){
            System.out.print("[ROW "+i+"]");
            System.out.print("["+TicTacToe[i][0]+"]");
            System.out.print("["+TicTacToe[i][1]+"]");
            System.out.print("["+TicTacToe[i][2]+"]");
            System.out.println();
        }
    }
}
