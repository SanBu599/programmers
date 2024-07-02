import java.util.Scanner;

public class B10990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String M[] = new String[N.length()];
        int result = 1;
        for (int i = 0; i < N.length() / 2; i++) {
            if (!Character.toString(N.charAt(i)).equals(Character.toString(N.charAt(N.length() - (i + 1))))) {
                result = 0;
                break;
            }
        }
        System.out.println(result==1 ? "1":"0");
    }
}
