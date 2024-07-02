import java.util.Arrays;

public class P120902 {
    public static void main(String[] args) {
        // 문자열 계산하기
        String my_string = "5 + 3 - 2 + 7";
        int answer = solution(my_string);
        System.out.println(answer);
    }
    public static int solution(String my_string) {
        String[] parts = my_string.split(" ");
        int answer = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int num2 = Integer.parseInt(parts[i + 1]);
            if (operator.equals("+")) {
                answer += num2;
            } else if (operator.equals("-")) {
                answer -= num2;
            }
        }
        return answer;
    }
}
