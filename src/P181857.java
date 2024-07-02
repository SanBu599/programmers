import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181857 {
    public static void main(String[] args) {
        // 배열의 길이를 2의 거듭제곱으로 만들기
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] answer = solution(arr);
        System.out.println(Arrays.toString(answer));
    }
//    public static int[] solution(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//        for (int a : arr){
//            list.add(a);
//        }
//        int pow = 0;
//        int size = list.size();
//        for(int i = 0; i < 11; i++) {
//            if(size <= Math.pow(2, i)) {
//                pow = i;
//                break;
//            }
//        }
//        int a = (int) Math.pow(2, pow);
//        if(size == a) {
//            return arr;
//        } else {
//            for(int i = 0; i < a - size; i++) {
//                list.add(0);
//            }
//        }
//        int[] answer = new int[list.size()];
//        for(int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
    public static int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
