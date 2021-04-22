package 简单.数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Albers
 * @date: 2021/4/22
 * @description:
 */
public class 有效的数独 {


    public static boolean isValidSudoku(char[][] board) {
        int length = board.length;
        int line[][] = new int[length][length];
        int column[][] = new int[length][length];
        int cell[][] = new int[length][length];
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                //没有填数字，直接跳过
                if (board[i][j] == '.') {
                    continue;
                }
                //当前格子的数字
                int num = board[i][j] - '0' - 1;
                //k是第几个单元格
                int k = i / 3 * 3 + j / 3;

                if (line[i][num] != 0 || column[j][num] != 0 || cell[k][num] != 0) {
                    return false;
                }
                //表示第i行有num这个数字，第j列有num这个数字，对应的单元格内也有num这个数字
                line[i][num] = column[j][num] = cell[k][num] = 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
