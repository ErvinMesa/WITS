package Matrices;

public class Matrices_04 {
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
            for(int j = 0;j < 3;j++){
                System.out.print("["+TicTacToe[i][j]+"]");
            }
            System.out.println();
        }
    }
}
