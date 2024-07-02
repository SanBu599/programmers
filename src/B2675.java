import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            String B = st.nextToken();
            for(int j=0;j<B.length();j++){
                char C = B.charAt(j);
                for(int k = 0;k<A;k++){
                    System.out.print(C);
                }
            }
            System.out.println();
        }
    }
}
