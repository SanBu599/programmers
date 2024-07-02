import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sum {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] l = new long[suNo+1];
        StringTokenizer stt = new StringTokenizer(br.readLine());
        for(int j= 1 ; j<= suNo;j++){
            l[j] = l[j-1] + Integer.parseInt(stt.nextToken());
        }
        for(int i= 0 ; i<quizNo;i++){
            StringTokenizer sttt = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(sttt.nextToken());
            int b = Integer.parseInt(sttt.nextToken());
            System.out.println(l[b]-l[a-1]);
        }
    }
}
