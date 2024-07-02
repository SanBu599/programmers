import java.util.Arrays;

public class P181830 {
    public static void main(String[] args) {
        // 정사각형으로 만들기
        int[][] arr = {{572, 22, 37},{287, 726, 384},{85, 137, 292},{487, 13, 876}};
        int[][] answer = solution(arr);
        System.out.println(Arrays.deepToString(answer));
    }
    public static int[][] solution(int[][] arr) {
        int max = Math.max(arr.length,arr[0].length);
        int[][] answer = new int[max][max];
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
