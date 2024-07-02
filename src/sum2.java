import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sum2 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] c = new int[N];
        for(int i = 0 ; i < N ; i++){
            c[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(c);
        int count = 0;
        int first = 0;
        int last = N-1;
        while (first<last){
            if(c[first]+c[last]<M){
                first++;
            } else if (c[first]+c[last]>M) {
                last--;
            } else {
                count++; first++; last--;
            }
        }
        System.out.println(count);
    }
}
