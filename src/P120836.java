public class P120836 {
    public static void main(String[] args) {
        // 순서쌍의 개수
        int n = 8;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0;
        // i를 1부터 n의 제곱근까지 반복합니다.
        for (int i = 1; i <= Math.sqrt(n); i++) {
            System.out.println(i);
            // i가 n의 약수인지 확인합니다.
            if (n % i == 0) {
                int j = n / i;  // j를 계산합니다.
                System.out.println("i: " + i + ", j: " + j);
                if (i == j) {
                    // i와 j가 같으면 하나의 쌍으로 세기
                    answer += 1;
                } else {
                    // i와 j가 다르면 두 개의 쌍으로 세기
                    answer += 2;
                }
            }
        }
        return answer;
    }
}
