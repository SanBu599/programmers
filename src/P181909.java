import java.util.ArrayList;
import java.util.Collections;

public class P181909 {
    public static void main(String[] args) {
        String a = "banana";
        ArrayList<String> answer = new ArrayList<>();
        String[] b = {};
        for (int i = 1 ; i<=a.length() ; i++ ){
            answer.add(a.substring(a.length()-i));
        }
        Collections.sort(answer);
        b = answer.stream().toArray(String[]::new);
        System.out.println(answer);
    }
}
