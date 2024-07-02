import java.util.ArrayList;
import java.util.Arrays;

public class P181895 {
    public static void main(String[] args) {
        // 배열 만들기3
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};
        ArrayList<Integer> answer = new ArrayList<>();
        for (int[] a : intervals){
            int c = a[0];
            int d = a[1];
            for(int i = c ; i <= d ; i++){
                answer.add(arr[i]);
            }
        }
        int[] result = new int[answer.size()];
        for (int j = 0 ; j < answer.size() ; j++){
            result[j] = answer.get(j);
        }
        System.out.println(answer);
    }
}
