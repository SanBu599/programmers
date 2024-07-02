public class P120889 {
    public static void main(String[] args) {
        // 삼각형의 완성조건(1)
        int[] sides = {3,3,2};
        int answer = solution(sides);
        System.out.println(answer);
    }
    public static int solution(int[] sides) {
        int max = 0;
        int total = 0;
        for (int side : sides) {
            if (side > max) {
                max = side;
            }
        }
        for (int a : sides){
            total += a;
        }
        return max < total-max ? 1 : 2;
    }
}
