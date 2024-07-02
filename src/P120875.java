import java.util.Arrays;

public class P120875 {
    public static void main(String[] args) {
        // 평행
        int[][] dots = {{1,4},{9,2},{3,8},{11,6}};
        int answer = solution(dots);
        System.out.println(answer);
    }
    public static int solution(int[][] dots) {

        if (calculateSlope(dots[0], dots[1]) == calculateSlope(dots[2], dots[3])) return 1;
        if (calculateSlope(dots[0], dots[2]) == calculateSlope(dots[1], dots[3])) return 1;
        if (calculateSlope(dots[0], dots[3]) == calculateSlope(dots[1], dots[2])) return 1;
        return 0;
    }

    private static double calculateSlope(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];
        if (x1 == x2) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) (y2 - y1) / (x2 - x1);
    }
}
