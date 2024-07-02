import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class P120835 {
    public static void main(String[] args) {
        // 진료 순서정하기
        int[] emergency = {3,76,24};
        int[] answer = solution(emergency);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] emergency) {

        Integer[] emergencyInteger = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(emergencyInteger, Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergencyInteger.length; i++) {
            map.put(emergencyInteger[i], i + 1);
        }
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}
