package Repl_It;

import java.util.Arrays;

public class Repl_171 {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (int i = 0; i <= 7; i++) {
            char letters = 'a';
            for (int j = 0; j <= 7; j++) {
                chessBoard[i][j] = "" + (i+1) + letters;
                letters++;
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }

}