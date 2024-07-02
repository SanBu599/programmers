import java.util.ArrayList;
import java.util.Arrays;

public class P181862 {
    public static void main(String[] args) {
        // 세 개의 구분자
        String myStr = "abcd";
        String[] answer = solution(myStr);
        System.out.println(Arrays.toString(answer));
    }
    public  static String[] solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        myStr = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ").trim();
        String[] parts = myStr.split(" ");
        if (parts.length == 0 || (parts.length == 1 && parts[0].isEmpty())) {
            return new String[]{"EMPTY"};
        }
        for (String part : parts) {
            if (!part.isEmpty()) {
                answer.add(part);
            }
        }

        String[] result = new String[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
