import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = "*";
        for (int i = 0; i<a;i++){
            for (int j = i; j<a ;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
