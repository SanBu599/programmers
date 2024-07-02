import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String a = "";
        String b = "";
        for(int i = 2; i>=0;i--){
            a += Character.toString(A.charAt(i));
            b += Character.toString(B.charAt(i));
        }
        int C = Integer.parseInt(a);
        int D = Integer.parseInt(b);
        System.out.println(Math.max(C,D));
    }
}
