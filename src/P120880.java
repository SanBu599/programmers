import java.util.*;

public class P120880 {
    public static void main(String[] args) {
        // 특이한 정렬
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        System.out.println(Arrays.toString(solution(numlist, n)));
    }
    public static <List> int[] solution(int[] numlist, int n) {
        Integer[] numlistInteger = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(numlistInteger, (a, b) -> {
            int diffA = Math.abs(a - n);
            int diffB = Math.abs(b - n);
            if (diffA == diffB) {
                return b - a;  // 거리가 같으면 더 큰 수가 앞에 오도록
            } else {
                return diffA - diffB;  // 거리에 따라 정렬
            }
        });
        return  Arrays.stream(numlistInteger).mapToInt(Integer::intValue).toArray();
    }
}
