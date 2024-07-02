import java.util.ArrayList;
import java.util.Arrays;

public class P181888 {
    public static void main(String[] args) {
        // n개 간격의 원소들
        int[] num_list = {4,2,6,1,7,6};
        int n = 4;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        int[] result = new int[answer.size()];
        for (int i = 0 ; i < answer.size() ; i++){
            result[i] = answer.get(i);
        }
    }
}
