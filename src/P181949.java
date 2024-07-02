import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P181949 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        char[] b = a.toCharArray();
        for(int i = 0 ;i<b.length;i++){
            if(Character.isLowerCase(b[i])){
                b[i] = Character.toUpperCase(b[i]);
            } else if (Character.isUpperCase(b[i])) {
                b[i] = Character.toLowerCase(b[i]);
            }
        }
        a = new String(b);
        System.out.println(a);
//        char[] b = a.toCharArray();
//        for(int i = 0; i<b.length;i++){
//            if(b[i]>='a' && b[i]<='z'){
//                b[i] = Character.toUpperCase(b[i]);
//            } else {
//                b[i] = Character.toLowerCase(b[i]);
//            }
//        }
//        a = new String(b);
//        System.out.println(a);
    }
}
