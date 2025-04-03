import java.util.Scanner;
// 112275

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] massive = new int[N];
        for (int i = 0; i < N; i++) {
            massive[i] = (int) Math.pow(2, i + 1); // 2^(i+1)

        }

        for (int i = N - 1; i >= 0; i--) {

            System.out.print(massive[i] + " ");

        }

    }
}
