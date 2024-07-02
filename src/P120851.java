public class P120851 {
    public static void main(String[] args) {
        // 숨어있는 숫자의 덧셈(1)
        String my_string = "aAb1B2cC34oOp";
        int answer = solution(my_string);
        System.out.println(answer);
    }
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]","").replaceAll("[A-Z]","");
        for (int i = 0 ; i < my_string.length() ; i++){
            answer += my_string.charAt(i)-'0';
        }
        return answer;
    }
}
