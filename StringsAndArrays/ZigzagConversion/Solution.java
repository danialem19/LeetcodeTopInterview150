package ZigzagConversion;

import java.util.Arrays;

public class Solution {
    public String convert(String s, int numRows) {
        //Assume you are doing this on a 2D matrix, and moving in zigzag
        int n = s.length();
        int charsPerSection = 2 * numRows - 2;
        int colsPerSection = numRows - 1;
        int numSections = Math.ceilDiv(n, charsPerSection);
        int numCols = colsPerSection * numSections;

        char[][] matrix  = new char[numRows][numCols];
        for (char[] rows : matrix) {
            Arrays.fill(rows, ' ');
        }

        int ver = 0, hor = 0, sIndex = 0;
        while (sIndex <  n) {
            //Fill the string characters array down
            while (ver < numRows && sIndex < n) {
                matrix[ver++][hor] = s.charAt(sIndex++);
            }

            //Fill the string characters array diagonal
            ver -= 2;
            hor++;
            while (ver > 0 && hor < numCols && sIndex < n) {
                matrix[ver--][hor++] = s.charAt(sIndex++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char[] rows : matrix) {
            for (char c : rows) {
                if (!Character.isSpaceChar(c)) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();

    }
}
