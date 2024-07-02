import java.util.Arrays;

public class P181832 {
    public static void main(String[] args) {
        // 정수를 나선형으로 배치하기
        int n = 3;
        int[][] answer = solution(n);
        System.out.println(Arrays.deepToString(answer));
    }
//        public static int[][] solution(int n) {
//            int[][] answer = new int[n][n];
//            int rowCnt = 0;
//            int colCnt = 0;
//            int increaseValue = 1;
//            int moving = 0;
//
//            while(increaseValue <= n * n) {
//                answer[rowCnt][colCnt] = increaseValue++;
//                System.out.println(Arrays.deepToString(answer));
//                if (moving == 0) { //오른쪽 가로 이동
//                    if (colCnt < (n - 1) && answer[rowCnt][colCnt + 1] == 0) {
//                        colCnt++;
//                    } else {
//                        moving = 1;
//                        rowCnt++;
//                    }
//                } else if (moving == 1) { // 아래 세로로 이동
//                    if (rowCnt < (n - 1) && answer[rowCnt + 1][colCnt] == 0) {
//                        rowCnt++;
//                    } else {
//                        moving = 2;
//                        colCnt--;
//                    }
//                } else if (moving == 2) { // 왼쪽 가로로 이동
//                    if (colCnt > 0 && answer[rowCnt][colCnt - 1] == 0) {
//                        colCnt--;
//                    } else {
//                        moving = 3;
//                        rowCnt--;
//                    }
//                } else { // 3 위 세로로 이동
//                    if (rowCnt > 0 && answer[rowCnt - 1][colCnt] == 0) {
//                        rowCnt--;
//                    } else {
//                        moving = 0;
//                        colCnt++;
//                    }
//                }
//            }
//            return answer;
//        }
        public static int[][] solution(int n) {
            int[][] answer = new int[n][n];
            int num=1;
            int start=0;
            int end=n;

            while(num <= n*n){

                //->
                for(int j=start;j<end;j++) {
                    answer[start][j] = num++;
                    System.out.println(Arrays.deepToString(answer));
                    System.out.println("윗줄");
                    System.out.println("start의 값 : " + start);
                    System.out.println("end의 값 : " + j);
                }
                //v
                for(int i=start+1;i<end;i++)
                    answer[i][end-1]=num++;
                System.out.println(Arrays.deepToString(answer));
                System.out.println("아래줄");
                System.out.println("start의 값 : " + start);
                System.out.println("end의 값 : " + end);
                //<
                for(int j=end-2;j>=start;j--)
                    answer[end-1][j]=num++;
                System.out.println(Arrays.deepToString(answer));
                System.out.println("오른줄");
                System.out.println("start의 값 : " + start);
                System.out.println("end의 값 : " + end);
                //^
                for(int i=end-2;i>start;i--)
                    answer[i][start]=num++;
                System.out.println(Arrays.deepToString(answer));
                System.out.println("왼줄");
                System.out.println("start의 값 : " + start);
                System.out.println("end의 값 : " + end);
                start++;
                end--;

            }

            return answer;
        }
    }
