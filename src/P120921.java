import java.util.Arrays;

public class P120921 {
    public static void main(String[] args) {
        // 문자열 밀기
        String A = "abc";
        String B = "bca";
        System.out.println(solution(A,B));
    }
    public static int solution(String A, String B) {
//        String[] a = A.split("");
//        String[] b = B.split("");
//        int answer = 0, count = 1;
//        if (!Arrays.equals(a, b)){
//            while (true){
//                String str = "";
//                String lastnum = a[a.length - 1];
//                for (int i = a.length - 2; i >= 0; i--) {
//                    a[i + 1] = a[i];
//                }
//                a[0] = lastnum;
//                for (int i = 0; i < a.length; i++){
//                    str += a[i];
//                }
//
//                if (str.equals(B)){
//                    answer = count;
//                    break;
//                }
//
//                if (str.equals(A)){
//                    answer = -1;
//                    break;
//                }
//                count++;
//            }
//        }

//        if (A.equals(B)) {
//            return 0;
//        }
//
//        String rotated = A;
//        for (int i = 1; i <= A.length(); i++) {
//            rotated = rotated.charAt(rotated.length() - 1) + rotated.substring(0, rotated.length() - 1);
//
//            if (rotated.equals(B)) {
//                return i;
//            }
//        }
//
//        return -1;

        String tempB = B.repeat(3);
        System.out.println(tempB);
        System.out.println(tempB.indexOf(A));
        return tempB.indexOf(A);
    }
}
