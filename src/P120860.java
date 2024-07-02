public class P120860 {
    public static void main(String[] args) {
        // 직사각형 넓이 구하기
        int[][] dots = {{-1,-1},{1,1},{1,-1},{-1,1}};
        int answer = solution(dots);
        System.out.println(answer);
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        int xMax = dots[0][0];
        int xMin = dots[0][0];
        int yMax = dots[0][1];
        int yMin = dots[0][1];
        for (int[] dot : dots){
            if (dot[0]>xMax){
                xMax = dot[0];
            } else if (dot[0]<xMin) {
                xMin = dot[0];
            } else if (dot[1]>yMax) {
                yMax = dot[1];
            } else if (dot[1]<yMin){
                yMin = dot[1];
            }
        }
        answer = (xMax-xMin)*(yMax-yMin);
        return answer;
    }
}
