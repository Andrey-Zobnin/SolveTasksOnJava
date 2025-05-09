import java.util.Scanner;

public class MatrixCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int k = scanner.nextInt();
            int count = 0;

            for (int[] row : matrix) {
                for (int value : row) {
                    if (value == k) {
                        count++;
                    }
                }
            }

            System.out.println(count);
            scanner.close();
        }
    }
