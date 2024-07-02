import java.util.ArrayList;
import java.util.Arrays;

public class P181844 {
    public static void main(String[] args) {
        // 배열의 원소 삭제하기

        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        int[] answer = solution(arr,delete_list);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean delete = false;
            for (int deleteValue : delete_list) {
                if (arr[i] == deleteValue) {
                    delete = true;
                    break;
                }
            }
            if (!delete) {
                result.add(arr[i]);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
