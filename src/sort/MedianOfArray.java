package sort;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[N / 2]);
    }
}