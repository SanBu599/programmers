
public class P181904 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4 ;
        int c = 2;
        String answer = "";
        StringBuilder result = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i += m) {
            result.append(my_string.charAt(i));
        }
        answer = result.toString();
        System.out.println(answer);
    }
}
