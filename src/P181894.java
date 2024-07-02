import java.util.Arrays;

public class P181894 {
    public static void main(String[] args) {
        // 2의 영역
        int[] arr = {1, 1, 1};
        int first = 0;
        int last = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                first = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                last = i;
                break;
            }
        }

        int[] answer = new int[last - first + 1];
        int j = 0;
        if (first == 0 && last == 0) {
            answer[j] = -1;
        } else {
            for (int i = first ; i <= last ; i++) {
                answer[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
