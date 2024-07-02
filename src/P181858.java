import java.util.Arrays;

public class P181858 {
    public static void main(String[] args) {
        // 무작위 K개의 수 뽑기
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        int[] result = new int[k];
        int[] stream = Arrays.stream(arr).distinct().toArray();
        for (int i = 0; i < Math.min(stream.length, k); i++) {
            result[i] = stream[i];
        }
        for (int i = Math.min(stream.length, k); i < k; i++) {
            result[i] = -1;
        }
        System.out.println(Arrays.toString(result));
    }
}
