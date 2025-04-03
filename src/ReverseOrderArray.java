import java.util.Scanner;
// 112273
public class ReverseOrderArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        // add massive
        int[] massive = new int[N];

        // add element in the massive on reverse list
        for (int i = 0; i < N; i++) {
            massive[i] = X + (N - 1 - i);
        }

        // out massive in for
        for (int i = 0; i < N; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}