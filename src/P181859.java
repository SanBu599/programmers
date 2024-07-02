import java.util.ArrayList;
import java.util.Arrays;

public class P181859 {
    public static void main(String[] args) {
        // 배열 만들기 6
        int[] arr = {0, 1, 1, 0};
        int[] result = solution(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] result = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                result[j] = stk.get(j);
            }
            return result;
        }
    }
}
