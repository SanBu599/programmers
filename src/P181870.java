import java.util.ArrayList;

public class P181870 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};
        ArrayList<String> answer = new ArrayList<>();
        String[] b = {};
        for( String a : strArr){
            if(a.contains("ad")){
                answer.remove(a);
            }else{
                answer.add(a);
            }
            b = (String[]) answer.toArray();
        }
    }
}
