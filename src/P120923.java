import java.util.ArrayList;
import java.util.Arrays;

public class P120923 {
    public static void main(String[] args) {
        // 연속된 수의 합
        int num = 3 ;
        int total = 12;
        System.out.println(Arrays.toString(solution(num, total)));
    }
    public static int[] solution(int num, int total) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int sum = 0;
//        int i = 0;
//        while (true) {
//            sum = 0;
//            for (int j = 0; j < num; j++) {
//                sum += i + j;
//            }
//            if (sum == total) {
//                break;
//            }
//            i++;
//        }
//        for (int k = i ; k < i+num ; k++){
//            list.add(k);
//        }
//        int[] answer = new int[list.size()];
//        for (int j = 0 ; j <list.size(); j++){
//            answer[j] = list.get(j);
//        }
//        return answer;
        int[] result = new int[num];

        // 가장 작은 정수 x를 계산
        int x = (total - (num * (num - 1) / 2)) / num;

        // x부터 시작하여 num개의 연속된 정수를 배열에 담기
        for (int i = 0; i < num; i++) {
            result[i] = x + i;
        }

        return result;

    }
}
