public class P120906 {
    public static void main(String[] args) {
        // 자릿수 더하기
        int n = 1234;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0;
        for (char ch : String.valueOf(n).toCharArray()){
            answer += Integer.parseInt(String.valueOf(ch));
        }
        return answer;
    }
}
