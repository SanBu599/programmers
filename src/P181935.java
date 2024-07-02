public class P181935 {
    public int solution(int n) {
        int answer = 0;
        if(n%2==1){
            for(int i= 0;i<n;i+=2){
                answer += n-i;
            }
        }else {
            for(int i = 0;i<n;i+=2){
                answer += (n-i)*(n-i);
            }
        }
        return answer;
    }
}
