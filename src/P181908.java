public class P181908 {
    public static void main(String[] args) {
        String a = "banana";
        String b = "nan";
        int answer = 0;
        answer = a.endsWith(b)==true?1:0;
        System.out.println(answer);
    }
}
