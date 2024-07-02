public class P120839 {
    public static void main(String[] args) {
        // 가위 바위 보
        String rsp = "205";
        String answer = solution(rsp);
        System.out.println(answer);
    }
    public static String solution(String rsp) {
        String answer = "";
        for (char word : rsp.toCharArray()){
            if(word=='2'){
                answer += '0';
            } else if (word=='0') {
                answer += '5';
            } else if (word=='5'){
                answer += '2';
            }
        }
        return answer;
    }
}
