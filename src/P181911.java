public class P181911 {
    public static void main(String[] args) {
        String[] a = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] p = {{0, 4}, {1, 2}, {3, 5,}, {7, 7}};
        String answer = "";
        for (int i = 0 ; i < p.length;i++){
            answer += a[i].substring(p[i][0],p[i][1]+1);
        }
        System.out.println(answer);
    }
}
