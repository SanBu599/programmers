public class P120909 {
    public static void main(String[] args) {
        // 제곱수 판별하기
        int n = 144;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n){
        int answer = 0;
        int i = 1;
        int pow = 0;
        while (true) {
            pow = (int) Math.pow(i, 2);
            if (n == pow) {
                answer = 1;
                break;
            } else if (pow > n) {
                answer = 2;
                break;
            }
            i++;
        }
        return answer;
    }
}
