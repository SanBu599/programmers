public class Pro12932 {
    public int[] solution(long n) {
        int[] a = new int[String.valueOf(n).length()];
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        char[] b = sb.reverse().toString().toCharArray();
        for(int i = 0;i<a.length;i++){
            a[i] = b[i] - '0';
        }
        return a;
    }
}
