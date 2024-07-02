import java.util.Arrays;

public class P120844 {
    public static void main(String[] args) {
        // 배열 회전시키기
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        int[] answer = solution(numbers,direction);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")){
            for (int i = 0 ; i < numbers.length ; i ++){
                if (i==0){
                    answer[i] = numbers[numbers.length-1];
                }else {
                    answer[i] = numbers[i-1];
                }
            }
        }else {
            for (int i = 0 ; i < numbers.length ; i ++){
                if (i== numbers.length-1){
                    answer[i] = numbers[0];
                }else {
                    answer[i] = numbers[i+1];
                }
            }
        }
        return answer;
    }
}
