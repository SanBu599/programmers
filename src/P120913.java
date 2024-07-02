import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120913 {
    public static void main(String[] args) {
        // 잘라서 배열로 저장하기
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        String[] answer = solution(my_str,n);
        System.out.println(Arrays.toString(answer));
    }
    public static String[] solution(String my_str, int n){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length() ; i+=n){
            list.add(my_str.substring(i, Math.min(i+n, my_str.length())));
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
