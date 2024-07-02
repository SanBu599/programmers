import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120907 {
    public static void main(String[] args) {
        // OX퀴즈
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answer = solution(quiz);
        System.out.println(Arrays.toString(answer));
    }
    public static String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for (String q : quiz){
            String[] a = q.split(" ");
            int b = Integer.parseInt(a[0]);
            int c = Integer.parseInt(a[2]);
            int d = Integer.parseInt(a[4]);
            if (a[1].equals("+")){
                if (b+c==d){
                    list.add("O");
                }else {
                    list.add("X");
                }
            }else {
                if (b-c==d){
                    list.add("O");
                }else {
                    list.add("X");
                }
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
