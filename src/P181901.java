import java.util.ArrayList;
import java.util.List;

public class P181901 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        List<Integer> answerList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answerList.add(i);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
            System.out.print(answer[i]);
        }
    }
}
