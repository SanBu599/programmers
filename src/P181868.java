import java.util.ArrayList;
import java.util.Arrays;

public class P181868 {
    public static void main(String[] args) {
        String a = " I   love you ";
//        ArrayList<String> resultList  = new ArrayList<>();
//        String[] words = a.split(" ");
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                resultList.add(word);
//                System.out.println(word);
//            }
//        }
//        System.out.println();
        String[] answer = a.trim().split("[ ]+");
        for (String b : answer ){
            System.out.println(b);
        }
    }
}
