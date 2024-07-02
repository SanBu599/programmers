public class P120891 {
    public static void main(String[] args) {
        // 369게임
        int order = 3;
        int answer = solution(order);
        System.out.println(answer);
    }
    public static int solution(int order) {
        int answer = 0;
        String a = order+"";
        for (char c : a.toCharArray()){
            if(c=='3'||c=='6'||c=='9'){
                answer +=1;
            }
        }
        return answer;
    }
}
