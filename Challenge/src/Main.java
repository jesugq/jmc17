public class Main {

    public static void main(String[] args) {

        int[][] moves = { {0,0}, {1,1}, {0,1}, {0,2}, {1,0}, {2,0} };

        System.out.println(
                tictactoe(moves)
        );
    }

    public static String tictactoe(int[][] moves) {

        for (int i = 0; i <= 1; i ++) {

            if (isWinner(moves, i)) return (i%2 == 0) ? "A" : "B";
        }

        return (moves.length==9) ? "Draw" : "Pending";
    }

    private static boolean isWinner(int[][] moves, int i) {

        int diagr = 0;
        int diagl = 0;
        int[] rows = new int[3];
        int[] cols = new int[3];

        for (int j = i; j < moves.length; j += 2) {

            if (moves[j][0] ==   moves[j][1]) diagr ++;
            if (moves[j][0] == 2-moves[j][1]) diagl ++;
            rows[moves[j][0]] ++;
            cols[moves[j][1]] ++;
        }

        for (int j = 0; j < 3; j ++) {

            if ( rows[j]==3 || cols[j]==3 ) return true;
        }

        return (diagr==3) || (diagl==3);
    }
}
