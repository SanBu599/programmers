import java.util.Scanner;

public class B2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            for(int j = N-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
