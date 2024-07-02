import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int totalMinutes = A * 60 + B + C;
        int newA = totalMinutes / 60 % 24;
        int newB = totalMinutes % 60;

        System.out.println(newA + " " + newB);

        sc.close();

    }
}
