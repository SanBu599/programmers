import java.util.Scanner;

public class B2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 2 * N - 1; i++) {
            if (i < N) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k < 2 * N - i; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
