import java.util.Random;
import java.util.Scanner;
// 112278
public class ThreeDigitNotDivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int[] array = new int[N];

        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(B - A + 1) + A;
        }

        // Вывод массива
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int num : array) {
            if (num >= 100 && num <= 999 && num % 5 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}