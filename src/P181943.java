import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P181943 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String overwrite_string = "bbb";
        int s = 3;
//        System.out.println(my_string.substring(s,s+overwrite_string.length()));
//        String answer = my_string.replaceAll(my_string.substring(s,s+overwrite_string.length()),overwrite_string);
//        System.out.println(my_string.replaceAll(my_string.substring(s,s+overwrite_string.length()), "b"));
//        System.out.println(answer);
        String l = my_string.substring(0,s);
        String r = my_string.substring(s+overwrite_string.length());
        String answer = l+ overwrite_string +r;
        System.out.println(answer);
    }
}
