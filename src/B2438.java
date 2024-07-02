import java.util.Scanner;

public class B2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = "*";
        for(int i= 0 ; i<a;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
