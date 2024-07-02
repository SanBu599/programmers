import java.util.ArrayList;
import java.util.Arrays;

public class P181893 {
    public static void main(String[] args) {
        // 배열 조각하기
        int[] arr = {4,5,4};
        int[] query = {1,0};
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
