import java.util.Arrays;

public class P120842 {
    public static void main(String[] args) {
        // 2차원으로 만들기
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        int[][] answer = solution(num_list,n);
        System.out.println(Arrays.deepToString(answer));
    }
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int k = 0 ;
        for ( int i = 0 ; i < num_list.length/n ; i++){
            for ( int j = 0 ; j < n ; j++){
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }
}
