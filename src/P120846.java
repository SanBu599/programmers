import java.util.Arrays;
import java.util.stream.IntStream;

public class P120846 {
    public static void main(String[] args) {
        // 합성수 찾기
        int n = 15;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0;
        int[] range = IntStream.range(4,n+1).toArray();
        for (int i : range){
            int count = 0;
            for (int j = 1; j <= i ; j++){
                if (i%j==0){
                    count += 1;
                }
            }
            if ( count >= 3){
                answer += 1;
            }
        }
        return answer;
    }
}
