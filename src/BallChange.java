import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BallChange {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total[] = new int[31];
        for(int i = 1 ; i<=28; i++){
            int a = Integer.parseInt(br.readLine());
            total[a] += a;
        }
        for(int j = 1; j<=30;j++){
            if(total[j]==0){
                System.out.println(j);
            }
        }
    }
}
