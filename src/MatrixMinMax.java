import java.util.*;


public class MatrixMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение размеров матрицы
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Инициализация матрицы
        int[][] matrix = new int[N][M];

        // Чтение элементов матрицы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Инициализация переменных для поиска минимума и максимума
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minRow = -1, minCol = -1;
        int maxRow = -1, maxCol = -1;

        // Поиск минимума и максимума
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minRow = i + 1; // +1 для 1-индексации
                    minCol = j + 1; // +1 для 1-индексации
                }
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i + 1; // +1 для 1-индексации
                    maxCol = j + 1; // +1 для 1-индексации
                }
            }
        }

        // Вывод результатов
        System.out.println(minRow + " " + minCol + " " + minValue);
        System.out.println(maxRow + " " + maxCol + " " + maxValue);

        scanner.close();
    }
}