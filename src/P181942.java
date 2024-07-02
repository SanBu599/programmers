public class P181942 {
    public static void main(String[] args) {
        String a= "aaa";
        String b = "bbb";
        String answer ="";
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        for(int i = 0 ; i< a.length(); i++){
            answer += c[i];
            answer += d[i];
        }
    }
}
