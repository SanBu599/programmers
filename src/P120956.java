import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class P120956 {
    public static void main(String[] args) {
        // 옹알이 (1)
        String[] babbling = {"ayaye","uuuma","ye","yemawoo","ayaa"};
        System.out.println(solution(babbling));
    }
    public static int solution(String[] babbling) {
        Pattern pattern = Pattern.compile("^(aya|ye|woo|ma)+$");
        int count = 0;
        for (String word : babbling) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                count += 1;
            }
        }
        return count;
    }
}
