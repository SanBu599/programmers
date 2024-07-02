import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine().toUpperCase();
        int arr[] = new int[26];
        int Max = 0;
        int MaxValue = 0;
        for (int i = 0; i< N.length(); i++){
            arr[N.charAt(i)-'A'] += 1;
        }
        for (int i = 0; i<arr.length;i++){
            if (arr[i]==Max){
                MaxValue = -1;
            }else if (arr[i]>Max){
                Max = arr[i];
                MaxValue = i;
            }
        }
        char result = (MaxValue == -1) ? '?' : (char) ('A' + MaxValue);
        System.out.println(result);
    }
}
