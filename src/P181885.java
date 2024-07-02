import java.util.ArrayList;
import java.util.Arrays;

public class P181885 {
    public static void main(String[] args) {
        // 할일 목록
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true,false,true,false};
        P181885 solution = new P181885();
        String[] answer = solution.solution(todo_list,finished);
        System.out.println(Arrays.toString(answer));
    }
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0 ; i < todo_list.length ; i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        String[] result = new String[answer.size()];
        for (int i = 0 ; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}
