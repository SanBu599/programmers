public class P181913 {
    public static void main(String[] args) {
        // 문자열 여러 번 뒤집기
        String my_string = "rermgorpsam";
        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
        for (int[] query : queries){
            int s = query[0];
            int e = query[1];
            String box = "";
            for (int i = e ; i > s-1 ; i--) {
                box += my_string.charAt(i);
            }
            my_string = my_string.replace(my_string.substring(s,e+1),box);
            System.out.println(my_string);
        }
        System.out.println();
    }
}
// rm
// remrgorp
// rmers
// sremm
