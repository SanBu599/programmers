import java.util.Arrays;

public class P120899 {
    public static void main(String[] args) {
        // 가장 큰 수 찾기
        int[] array = {1,8,3};
        int[] answer = solution(array);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        answer[0] = max;
        answer[1] = 0;
        for (int i = 1 ; i < array.length-1 ; i++){
            if (max<array[i]){
                max = array[i];
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}
