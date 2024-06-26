public class QueenCombination {
    public static void main(String[] args){
        QueenCombination(new boolean[4], 0, 0, 2, " ");
    }
    public static void QueenCombination(boolean[] board, int col, int qpsf, int tq, String ans){
       if(qpsf==tq){
           System.out.println(ans);
           return;
       }
       if(col==board.length){
           return;
       }
       board[col] = true;
       QueenCombination(board, col+1, qpsf+1, tq, ans + "B"+col);
       board[col] = false;
       QueenCombination(board, col+1, qpsf, tq, ans );

    }
}




