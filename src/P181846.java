import java.math.BigInteger;

public class P181846 {
    public static void main(String[] args) {
        // 두 수의 합
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        String answer = solution(a,b);
        System.out.println(answer);
    }
    public static String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger sum = num1.add(num2);
        return sum.toString();
    }
}
