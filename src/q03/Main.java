import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        
        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

    
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Diagonal: " + diagonalSum);
    }
}
