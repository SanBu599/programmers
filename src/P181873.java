public class P181873 {
    public static void main(String[] args) {
        String a = "programmers";
        String b = "p";
        String answer = "";

        answer = a.replaceAll(b,b.toUpperCase());
        System.out.println(answer);
    }
}
