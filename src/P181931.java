public class P181931 {
    public static void main(String[] args) {
        int answer = 0;
        int a = 3;
        int d = 4;
        boolean[] included = {true, false,false, true, true};
        int[] b = new int[included.length];
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + i * d;
            }
        }
        System.out.println(answer);
    }
}
