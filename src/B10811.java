import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Basket[] = new int[N+1];
        for(int i = 1;i<=N;i++){
            Basket[i]=i;
        }
        int box = 0;
        for (int j = 0; j<M;j++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st1.nextToken());
            while (A<B){
                box = Basket[A];
                Basket[A++] = Basket[B];
                Basket[B--] = box;
            }
        }
        for(int z= 1;z<=N;z++)
            System.out.print(Basket[z]+ " ");
    }
}
