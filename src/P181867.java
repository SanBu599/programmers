import java.util.Arrays;

public class P181867 {
    public static void main(String[] args) {
        String a = "oxooxoxxox";
        String[] str = a.split("x",-1);
        int[] answer =  new int[str.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str[i].length();
            System.out.println(answer[i]);
        }
    }
}
