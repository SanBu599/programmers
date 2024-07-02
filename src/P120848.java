import java.util.stream.IntStream;

public class P120848 {
    public static void main(String[] args) {
        // 팩토리얼
        int n = 3628800;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 1;
        int factorial = 1;
        while (factorial <= n){
            answer++;
            factorial *= answer;
        }
        return answer - 1;
    }
}
