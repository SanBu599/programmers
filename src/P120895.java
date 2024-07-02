public class P120895 {
    public static void main(String[] args) {
        // 인덱스 바꾸기
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        String answer = solution(my_string,num1,num2);
        System.out.println(answer);
    }
    public static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = "";
        char temp = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, temp);
        return sb.toString();
    }
}
