public class P181831 {
    public static void main(String[] args) {
        // 특별한 이차원 배열 2
        int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
        int answer = solution(arr);
        System.out.println(answer);
    }
    public static int solution(int[][] arr) {
        int answer = 1;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.println(arr[i][j]);
                System.out.println(arr[j][i]);
                if(arr[i][j]!=arr[j][i]){
                    answer = 0;
                }
            }
        }
        return answer;
    }
}
