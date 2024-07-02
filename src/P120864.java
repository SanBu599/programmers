import java.util.Arrays;

public class P120864 {
    public static void main(String[] args) {
        // 숨어있는 숫자의 덧셈(2)
        String my_string = "aAb1B2cC34oOp";
        int answer = solution(my_string);
        System.out.println(answer);
    }
    public static int solution(String my_string){
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");
        for (String st : str){
            if(!st.isEmpty()){
                answer += Integer.parseInt(st);
            }
        }
        return answer;
    }
}
