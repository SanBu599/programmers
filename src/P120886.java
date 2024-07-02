import java.util.Arrays;

public class P120886 {
    public static void main(String[] args) {
        // A로 B 만들기
        String before = "12345";
        String after = "25314";
        System.out.println(solution(before,after));
    }
    public static int solution(String before, String after) {
        int answer = 0;
        String[] arr1 = new String[before.length()];
        String[] arr2 = new String[after.length()];

        for(int i = 0; i < before.length(); i++)
            arr1[i] = before.charAt(i) + "";

        for(int i = 0; i < after.length(); i++)
            arr2[i] = after.charAt(i) + "";

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) answer = 1;

        return answer;
    }
}
