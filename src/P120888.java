import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class P120888 {
    public static void main(String[] args) {
        // 중복된 문자 제거
        String my_string = "We are the world";
        String answer = solution(my_string);
        System.out.println(answer);
    }
    public static String solution(String my_string) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();

        for (char c : my_string.toCharArray()){
            if (!seen.contains(c)){
                stack.push(c);
                seen.add(c);
            }
        }
        for (int i = 0 ; i < stack.size() ; i++ ){
            answer += stack.get(i);
        }
        return answer;
    }
}
