import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        char[] c = b.toCharArray();
        int d = 0;
        for( int i = 0 ; i < a ; i++){
            d += c[i] - '0';

        }
        System.out.println(d);
    }
}

// 첫번째 입력값a은 두번쨰 입력값b의 길이
// 두번째 입력값b은 숫자로 받게 하거나 스트링으로 받게 끔
// b를 단위별로 쪼개고
// 쪼개면서 int c에 더하기
// 완성
