import java.util.ArrayList;
import java.util.Arrays;

public class P181892 {
    public static void main(String[] args) {
        // n 번째 원소부터
        int[] num_list = {5,2,1,7,5};
        int n = 2;
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list,n-1,num_list.length);
        System.out.println(Arrays.toString(answer));
    }
}
