import java.util.Scanner;

public class P120823 {
    public static void main(String[] args) {
        // 직각삼각형 출력하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1 ; i <= n ; i++){
//            for (int j =0 ; j < i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }
}
