public class P181871 {
    public static void main(String[] args) {
        // 문자열이 몇 번 등장하는지 세기
        String myString = "banana";
        String pat = "ana";
        int answer = solution(myString,pat);
        System.out.println(answer);
    }
    public static int solution(String myString, String pat) {
        int answer = 0;
        for (int i = myString.length()-1 ; i >= 0 ; i--){
            if(myString.substring(i).startsWith(pat)){
                answer++;
            }
        }
        return answer;
    }
}
