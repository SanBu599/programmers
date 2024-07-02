import java.util.HashMap;
import java.util.Map;

public class P120871 {
    public static void main(String[] args) {
        // 저주의 숫자 3
        int n = 15;
        int answer = soulution(n);
        System.out.println(answer);
    }
    public static int soulution(int n){
        int answer = 0;
        int j = 0;
        int i = 0;
        while (j!=n){
            i++;
            if (i%3!=0 && !String.valueOf(i).contains("3")){
                j++;
            }
        }
        answer = i;
        return answer;
    }
}
