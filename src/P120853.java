public class P120853 {
    public static void main(String[] args) {
        // 컨트롤 제트
        String s = "1 2 Z 3";
        int answer = solution(s);
        System.out.println(answer);
    }
    public static int solution(String s) {
        int answer = 0;
        String[] a = s.split(" ");
        for (int i = 0 ; i < a.length ; i++){
            if (!a[i].equals("Z")){
                answer += Integer.parseInt(a[i]);
            }else{
                answer -= Integer.parseInt(a[i-1]);
            }
        }
        return answer;
    }
}
