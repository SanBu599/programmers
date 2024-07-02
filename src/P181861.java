import java.util.ArrayList;

public class P181861 {
    public static void main(String[] args) {
        int[] arr = {5,1,4};
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i <arr.length;i++){
            for (int j = 0 ; j<arr[i] ; j++){
                System.out.println(arr[i]);
                answer.add(arr[i]);
            }
        }
    }
}
