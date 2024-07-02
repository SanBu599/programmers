import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ball {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Basket[] = new int[N];
        for(int i = 0 ; i<M;i++){
            StringTokenizer st1= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            int c = Integer.parseInt(st1.nextToken());
            for(int j = a-1; j<=b-1;j++){
                if(Basket[j]==0){
                    Basket[j] += c;
                }else{
                    Basket[j] =0;
                    Basket[j] +=c;
                }
            }
        }
        for(int k= 0; k<N;k++){
            System.out.print(Basket[k]+" ");
        }
    }
}
