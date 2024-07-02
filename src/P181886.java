import java.util.ArrayList;
import java.util.Arrays;

public class P181886 {
    public static void main(String[] args) {
        // 5명씩
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        P181886 solution = new P181886();
        String[] result = solution.solution(names);
        System.out.println(Arrays.toString(result));
    }

    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length ; i+=5){
            answer.add(names[i]);
        }
        String[] result = new String[answer.size()];
        for (int i = 0 ; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}
