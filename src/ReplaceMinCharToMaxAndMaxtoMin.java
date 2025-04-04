import java.util.Scanner;

public class ReplaceMinCharToMaxAndMaxtoMin {
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a') {
                result.append('b');
                count++;
            } else if (c == 'A') {
                result.append('B');
                count++;
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
        System.out.println(count);
    }

}
