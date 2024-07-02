import java.util.ArrayList;

public class P181891 {
    public static void main(String[] args) {
        // 순서 바꾸기
        int[] num_list = {2,1,6};
        int n = 1;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0 ; i < num_list.length ; i++){
            if(i>=n){
                answer.add(num_list[i]);
            }
        }
        for (int i = 0 ; i < num_list.length ; i++){
            if(i<n){
                answer.add(num_list[i]);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0 ; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
    }
}
