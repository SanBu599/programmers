import java.util.ArrayList;

public class P181869 {
    public static void main(String[] args) {
        String a = "i lo";
        String[] b = a.split(" ");
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i<b.length;i++){
            answer.add(b[i]);
        }
    }
}
