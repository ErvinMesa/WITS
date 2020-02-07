package Methods;

public class Methods_Intro {
    public static void main(String[] args) {
        String[][] TicTacToe = new String[3][3];

        for(int i = 0;i < TicTacToe.length;i++){
            for (int j=0;j<TicTacToe[0].length;j++){
                TicTacToe[i][j]=" ";
            }
        }
        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < TicTacToe.length;i++){
            System.out.print("[ROW "+i+"]");
            for(int j = 0;j < 3;j++){
                System.out.print("["+TicTacToe[i][j]+"]");
            }
            System.out.println();
        }

        TicTacToe[1][1] = "X";

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < TicTacToe.length;i++){
            System.out.print("[ROW "+i+"]");
            for(int j = 0;j < 3;j++){
                System.out.print("["+TicTacToe[i][j]+"]");
            }
            System.out.println();
        }

        TicTacToe[0][2] = "O";

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < TicTacToe.length;i++){
            System.out.print("[ROW "+i+"]");
            for(int j = 0;j < 3;j++){
                System.out.print("["+TicTacToe[i][j]+"]");
            }
            System.out.println();
        }

        TicTacToe[2][2] = "X";

        System.out.println("TIC TAC TOE!");
        System.out.println("[COL #][0][1][2]");
        for(int i = 0;i < TicTacToe.length;i++){
            System.out.print("[ROW "+i+"]");
            for(int j = 0;j < 3;j++){
                System.out.print("["+TicTacToe[i][j]+"]");
            }
            System.out.println();
        }

        TicTacToe[0][1] = "O";

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
