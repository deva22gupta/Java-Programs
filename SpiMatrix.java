// Java program to form a Spiral Matrix
// from the given Array
//time complexity O(n)

package Prog;

import java.util.*;
import java.io.*;

public class SpiMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix.length == 0)
            return ans;
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int r = 0, c = 0, di = 0;
        for (int i = 0; i < R * C; i++) {
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }

    // Function to print the spiral matrix
    static void printSpiralMatrix(List<Integer> listt) {
        // for(int a:listt){
        // System.out.print(a + "");
        // }
//printing the direct list
        System.out.println(listt);

    }

    // Driver code

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        List<Integer> res = spiralOrder(arr);
        printSpiralMatrix(res);
    }
}

// This code is contributed by kanugargng
