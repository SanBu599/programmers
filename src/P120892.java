public class P120892 {
    public static void main(String[] args) {
        // 암호해독
        String cipher  = "pfqallllabwaoclk";
        int code = 2;
        String answer = solution(cipher,code);
        System.out.println(answer);
    }
    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] c = cipher.toCharArray();
        for (int i = code-1 ; i < c.length ; i+=4){
            answer.append(c[i]);
        }
        return answer.toString();
    }
}
