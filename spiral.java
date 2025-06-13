
    import java.util.*;
public class  spiral {
    public static void printSpiral(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;
            // Print right column
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;
            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }                  
                 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3,9},
            {4, 5, 6,0},
            {7, 8, 9,8},
        };
        printSpiral(matrix);
    }
}

