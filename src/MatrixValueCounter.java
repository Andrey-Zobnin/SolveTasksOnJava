import java.util.*;

public class MatrixValueCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> W = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(scanner.nextInt());
            }
            W.add(row);
        }

        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String numStr = String.valueOf(W.get(i).get(j));
                if (numStr.length() == k) {
                    int sum = 0;
                    for (char ch : numStr.toCharArray()) {
                        sum += Character.getNumericValue(ch);
                    }
                    if (sum % r == 0) {
                        c++;
                    }
                }
            }
        }

        System.out.println(c);
        scanner.close();
    }
}
