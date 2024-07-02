import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BallSwap {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int box = 0;
        int[] a = new int[N+1];
        for(int k= 1;k<=N;k++){
            a[k]=k;
        }
        for(int i= 0;i<M;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st1.nextToken());
            int c = Integer.parseInt(st1.nextToken());
            box = a[b];
            a[b] = a[c];
            a[c] = box;
        }
        for(int j = 1; j<=N;j++){
            System.out.print(a[j]+" ");
        }
    }
}
