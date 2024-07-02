import java.util.ArrayList;

public class P181872 {
    public static void main(String[] args) {
        // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
        String myString = "AAAAaaaa";
        String pat = "a";
        String answer = solution(myString,pat);
        // lattIndexOf도 있다 찾아보자
        System.out.println(myString.lastIndexOf(pat));
        System.out.println(answer);
    }
    public static String solution(String myString, String pat) {
        String answer = "";
        for ( int i = 1 ; i <= myString.length(); i++ ) {
            if(myString.substring(0,i).endsWith(pat)){
                answer = myString.substring(0,i);
            }
        }
        return answer;
    }
}
