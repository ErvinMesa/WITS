package Methods;

public class Methods_03 {
    public static void main(String[] args) {
        String[][] TicTacToe = new String[3][3];
        for(int i = 0;i < TicTacToe.length;i++){
            for (int j=0;j<TicTacToe[0].length;j++){
                TicTacToe[i][j]=" ";
            }
        }
        TicTacToe[1][1] = "X";
        printBoard(TicTacToe);
        TicTacToe[0][2] = "O";
        printBoard(TicTacToe);
        TicTacToe[2][2] = "X";
        printBoard(TicTacToe);
        TicTacToe[0][1] = "O";
        printBoard(TicTacToe);
    }

    public static void printBoard(String[][] TicTacToe){
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
