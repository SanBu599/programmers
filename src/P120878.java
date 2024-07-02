import java.util.ArrayList;
import java.util.List;

public class P120878 {
    public static void main(String[] args) {
        // 유한소수 판별하기
        int a = 12;
        int b = 21;
        System.out.println(solution(a,b));
    }
    public static int solution(int a, int b) {
        // 최대공약수를 구하여 기약분수로 만든다
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;

        // 분모 b가 2와 5만을 소인수로 가지는지 확인
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        // b가 1이 되면 유한소수, 그렇지 않으면 무한소수
        if (b == 1) {
            return 1; // 유한소수
        } else {
            return 2; // 무한소수
        }
    }
    // 최대공약수를 구하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
