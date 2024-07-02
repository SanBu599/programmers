import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b3052 {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> C = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<10;i++) {
            int A = Integer.parseInt(br.readLine().trim());
            C.add(A % 42);
        }
        System.out.println(C.size());
    }
}
