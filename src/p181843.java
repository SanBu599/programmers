public class p181843 {
    public static void main(String[] args) {
        // 부분 문자열인지 확인하기
        String my_string = "banana";
        String target = "ana";
        int answer = solution(my_string,target);
        System.out.println(answer);
    }
    public static int solution(String my_string, String target) {
        int answer = 0;
        return my_string.contains(target) ?1:0;
    }
}
