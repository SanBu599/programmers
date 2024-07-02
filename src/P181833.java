import java.util.Arrays;

public class P181833 {
    public static void main(String[] args) {
        // 특별한 이차원 배열 1
        int n = 3;
        int[][] answer = solution(n);
        System.out.println(Arrays.deepToString(answer));
    }
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                if(i==j){
                    answer[i][j] = 1;
                }
            }
        }
        return answer;
    }
}
