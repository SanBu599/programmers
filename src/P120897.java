import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120897 {
    public static void main(String[] args) {
        // 약수 구하기
        int n = 24;
        int[] answer = solution(n);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++){
            if(n%i==0){
                li.add(i);
            }
        }
        int[] answer = new int[li.size()];
        for (int i = 0 ; i < li.size() ; i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}
