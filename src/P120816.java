public class P120816 {
    public static void main(String[] args) {
        // 피자 나눠 먹기 (3)
        int slice = 7;
        int n = 10;
        int answer = solution(slice,n);
        System.out.println(answer);
    }
    public static int solution(int slice, int n) {
        int answer = 0;
        if (n % slice ==0){
            answer = n/slice;
        } else {
            answer = n/slice+1;
        }
        return answer;
    }
}
