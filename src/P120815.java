public class P120815 {
    public static void main(String[] args) {
        // 피자 나눠 먹기 (2)
        int n = 5;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 1;
        while ((answer * 6) % n != 0) {
            answer++;
        }
        return answer;
    }
}
