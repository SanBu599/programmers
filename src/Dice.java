import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Dice {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        int[] b = new int[3];
        int total = 0;
        int max = 0;
        for(int i = 0; i<3;i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        if(b[0]==b[1]&&b[0]==b[2]){
            total = 10000+b[0]*1000;
        }else if(b[0]==b[1]||b[0]==b[2]){
            total = 1000+b[0]*100;
        }else if(b[1]==b[0]||b[1]==b[2]){
            total = 1000+b[1]*100;
        }else{
            max = Math.max(b[0],b[1]);
            max = Math.max(max,b[2]);
            total = max*100;
        }
        System.out.println(total);
    }
}
