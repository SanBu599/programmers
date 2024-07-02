import java.util.Arrays;

public class P120849 {
    public static void main(String[] args) {
        // 모음 제거
        String my_string = "nice to meet you";
        String answer = solution(my_string);
        System.out.println(answer);

    }
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] a = my_string.split("[aeiou]");
        System.out.println(Arrays.toString(a));
        for (String b : a){
            answer.append(b);
        }
        return answer.toString();
    }
}
