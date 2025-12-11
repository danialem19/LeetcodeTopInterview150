package ZigzagConversion;

import java.util.Arrays;

public class Solution {

    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        //Assume you are doing this on a 2D matrix, and moving in zigzag
        int n = s.length();
        int charPerSection = 2 * numRows - 2;
        int numOfSctions = Math.ceilDiv(n, charPerSection);
        int numOfColPerSection = numRows - 1;
        int numCols = numOfColPerSection * numOfSctions;

        char[][] matrix = new char[numRows][numCols];
        for(char[] row : matrix) {
            Arrays.fill(row, ' ');
        }

        int i = 0, rowIndex = 0, colIndex = 0;
        while(i < n) {
            //Fill the string characters array down
            while(rowIndex < numRows && i < n) {
                matrix[rowIndex++][colIndex] = s.charAt(i++);
            }

            //Fill the string characters array diagonal
            rowIndex -= 2;
            colIndex++;
            while(rowIndex > 0 && colIndex < numCols && i < n) {
                matrix[rowIndex--][colIndex++] = s.charAt(i++);
            }
        }

        //Create the string
        StringBuilder sb = new StringBuilder();
        for(char[] row : matrix) {
            for(char c : row) {
                if(c != ' ') {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
