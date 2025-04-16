import java.util.Random;
import java.util.Scanner;
// 112277
public class EvenTens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FirstIntNumber = scanner.nextInt();
        int SecondIntNumber = scanner.nextInt();
        int NumberOfCount = scanner.nextInt();
        // create massive into my code 
        int[] massive = new int[NumberOfCount];

        // check random create ex
        Random random = new Random();
        for (int i = 0; i < NumberOfCount; i++) {
            massive[i] = random.nextInt(SecondIntNumber - FirstIntNumber + 1) + FirstIntNumber;
        }

        // out massive 
        for (int i = 0; i < NumberOfCount; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();

        // count elements -- count init 0
        int count = 0;
        for (int num : massive) {
            int tensDigit = (num / 10) % 10; // Получаем вторую цифру (число десятков)
            if (tensDigit % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}