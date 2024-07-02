public class P68935 {
    public static void main(String[] args) {
        int n = 45;
        // 1. 3진법으로 전환
        String a = Integer.toString(n,3);
        // 2. 앞뒤 변환
        StringBuilder sb = new StringBuilder(a);
        a= sb.reverse().toString();
        // 3. 10진법으로 전환
        int b =Integer.parseInt(a,3);
        System.out.println(b);
//        class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        // 1. 3진법으로 전환
//        String a = Integer.toString(n,3);
//        // 2. 앞뒤 전환
//        StringBuilder sb = new StringBuilder(a);
//        a = sb.reverse().toString();
//        // 3. 10진법으로 전환
//        answer = Integer.parseInt(a,3);
//        return answer;
//    }
//}
    }
}
