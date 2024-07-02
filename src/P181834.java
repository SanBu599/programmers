public class P181834 {
    public static void main(String[] args) {
        // l로 만들기
        String myString = "jjnnllkkmm";
        String answer = solution(myString);
        System.out.println(answer);
    }
    public static String solution(String myString) {
        String answer = "";
        answer = myString.replaceAll("[a-l]","l");
        return answer;
    }
}
