import java.util.HashMap;
import java.util.Map;

public class P120812 {
    public static void main(String[] args) {
        // 최빈값 구하기
        int[] array = {1,1,1,2,2};
        int answer = solution(array);
        System.out.println(answer);
    }
    public static int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (map.isEmpty() || !map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int v = map.get(array[i]);
                map.put(array[i], v + 1);
            }
        }
        System.out.println(map);
        int testV = 0 ;
        int maxK = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > testV) {
                testV = value;
                maxK = key;
            } else if (testV == value) {
                testV = -1;
                maxK = -1;
            }
        }
        answer = maxK;
        return answer;
    }
}
