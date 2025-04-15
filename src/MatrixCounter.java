import java.util.*;

public class MatrixCounter {
    public static void main(String argc) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                // matrix inntput
            }
        }
        int count = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if (matrix[i][j] == count) {
                   counter++;
               }

            }
        }
        System.out.println(counter);
    }
}
