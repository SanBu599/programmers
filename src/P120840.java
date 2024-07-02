import java.math.BigInteger;

public class P120840 {
    public static void main(String[] args) {
        // 구슬을 나누는 경우의 수
        int balls = 30;
        int share = 5;
        int answer = solution(balls,share);
        System.out.println(answer);
    }
    public static int solution(int balls, int share) {
//        long answer = factorial(balls) / (factorial(balls-share) * factorial(share));
//        return Math.toIntExact(answer);
        double answer = 1;

        for(int i = 0; i < share; i++){
            answer = answer * (balls - i) / (i+1);
        }
        return (int) answer;
    }

    private static long factorial(int n){
        long result = 1;
        for (int i = n ; i > 0 ; i--){
            result *= i;
        }
        return result;
    }
}
