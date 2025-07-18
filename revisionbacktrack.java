import java.util.*;
public class revisionbacktrack {
    public static void main(String[] args) {
        boolean board[][] = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        allPath("", 0, 0, board);
    }
    public static void allPath(String p, int r, int c, boolean board[][]){
        if(r==board.length-1 && c==board[0].length-1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        board[r][c] = false;
        if(r<board.length-1){
            allPath(p+'D', r+1,c, board);
        }
        if(c<board[0].length-1){
            allPath(p+'R', r,c+1, board);
        }
        if(r>0){
            allPath(p+'U', r-1,c, board);
        }
        if(c>0){
            allPath(p+'L', r,c-1, board);
        }
        board[r][c]=true;
    }
}
