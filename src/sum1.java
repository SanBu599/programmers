import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sum1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int first = 1;
        int last = 1;
        int sum = 1;
        while (last != N){
            if(sum==N){
                count++; last++; sum = sum+last;
            } else if (sum>N) {
                sum = sum-first;first++;
            }else{
                last++; sum = sum+ last;
            }
        }

        System.out.println(count);
    }
}
// int로 입력 값을 받고
// i가 1일 경우 2+3+4... 해준값이 입력값이 같을 경우에
