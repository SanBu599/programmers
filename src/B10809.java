import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        int[] B = new int[26];
        for(int i = 0; i<B.length;i++){
            B[i] = -1;
        }
        for(int j = 0; j<A.length();j++){
            char C = A.charAt(j);
            if(B[C - 'a']==-1){
                B[C-'a']=j;
            }
        }
        for(int val:B)
            System.out.print(val+" ");
    }
}

// 생각해보기
