package sort;
import java.util.Scanner;
public class StoneSorting {
    public static void main(String[] argc) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }
        boolean swap;
        int swapCount = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1;) {
                int temp_val = array[i];
                array[i] = array[j + 1];
                array[j + 1] = temp_val;
                swap = true;
                swapCount++;

                for (int k; k < num; k++) {
                    System.out.println(array[k]);
                    if (k < num - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (!swap) {
                break;
            }
        }

        if (swapCount == 0) {
            System.out.println(0);
        }
    }
}
