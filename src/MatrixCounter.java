import java.util.Scanner;

public class MatrixCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;

        // Читаем всю матрицу и сразу считаем элементы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (scanner.nextInt() == scanner.nextInt()) { // ❌ Ошибка! Сравниваем два следующих числа вместо K
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}