public class P120887 {
    public static void main(String[] args) {
        // k의 개수
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i,j,k));
    }
    public static int solution(int i, int j, int k) {
        int answer = 0;
        char kChar = (char) (k + '0');

        for (int a = i; a <= j; a++) {
            String b = Integer.toString(a);
            for (char ch : b.toCharArray()) {
                if (ch == kChar) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
