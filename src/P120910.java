public class P120910 {
    public static void main(String[] args) {
        // 세균 증식
        int n = 2;
        int t = 10;
        int answer = solution(n,t);
        System.out.println(answer);
    }
    public static int solution(int n, int t){
        int answer = n;
        int i = 0;
        while (i<t){
            answer = answer*2;
            System.out.println(answer);
            i++;
        }
        return answer;
    }
}
