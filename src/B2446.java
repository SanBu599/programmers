import java.util.Scanner;

public class B2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 2 * N - 1; i++) {
            if (i < N) {
                // 위쪽 삼각형
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * (N - i) - 1; k++) {
                    System.out.print("*");
                }
            } else {
                // 아래쪽 삼각형
                for (int j = 2 * N - i - 2; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int l = 2 * N - i - 2; l <= i; l++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
//        for (int i = 0; i < 2 * N - 1; i++) {
//            if(i>=5){
//                for (int j = 2 * N - i-2; j > 0; j--){
//                    System.out.print(" ");
//                }
//                for (int l = 2 * N -i -2 ;l <= i; l++){
//                    System.out.print("*");
//                }
//            }else{
//                for (int j = 0; j < i; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 0; k < 2 * (N - i) - 1; k++) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        for (int i=0;i<N;i++){
//            for(int l=1;l<=i;l++){
//                System.out.print(" ");
//            }
//            for(int j = N;j>i;j--){
//                System.out.print("*");
//            }
//            for(int j = N-1;j>i;j--){
//                System.out.print("*");
//            }
//            for(int k=0;k<=i;k++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<N;i++){
//            for( int j = N-1;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int l=1;l<=i;l++){
//                System.out.print("*");
//            }
//            for(int l=0;l<=i;l++){
//                System.out.print("*");
//            }
//            for(int k=N;k>i;k--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}
