import java.util.Scanner;

public class B2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int l=1;l<=i;l++){
                System.out.print(" ");
            }
            for( int j = N;j>i;j--){
                System.out.print("*");
            }
            for(int k=N-2;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
