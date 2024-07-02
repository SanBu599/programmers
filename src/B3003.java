import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] C = {1,1,2,2,2,8};
        int[] D = new int[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()){
            D[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        for(int j = 0; j<C.length;j++){
            if(C[j]==D[j]){
                D[j] = 0;
            } else if (C[j]>D[j]) {
                D[j] = C[j]-D[j];
            } else if (C[j]<D[j]) {
                D[j] = C[j]-D[j];
            }
            System.out.print(D[j]+" ");
        }
    }
}
