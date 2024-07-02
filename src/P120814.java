public class P120814 {
    public static void main(String[] args) {
        // 피자 나눠 먹기(1)
        int n = 7;
        int answer = solution(n);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0;
        int total = n/7;
        if(n>=1 && n<=100){
            if(total<1){
                answer = total+1;
            }else if(n%7==0){
                answer = total;
            }else {
                answer = total+1;
            }
        }
        return answer;
    }
}
