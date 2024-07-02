import java.util.Arrays;

public class P120850 {
    public static void main(String[] args) {
        // 문자열 정렬하기 (1)
        String my_string = "hi12392";
        int[] answer = solution(my_string);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        int[] answer = new int[my_string.length()];
        for (int i = 0 ; i < my_string.length() ; i++){
            answer[i] = my_string.charAt(i)-48;
        }
        Arrays.sort(answer);
        return answer;
    }
}
