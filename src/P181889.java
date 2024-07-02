import java.util.Arrays;

public class P181889 {
    public static void main(String[] args) {
        // n번째 원소까지
        int[] num_list = {5,2,1,7,5};
        int n = 3;
        int[] answer = Arrays.copyOfRange(num_list,0,n);
        System.out.println(Arrays.toString(answer));
    }
}
