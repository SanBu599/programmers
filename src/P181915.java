public class P181915 {
    public static void main(String[] args) {
        String a = "cvsgiorszzzmrpaqpe";
        String answer = "";
        int[] b = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        for (int i = 0 ; i < b.length; i++){
            answer+=a.charAt(b[i]);
        }
        System.out.println(answer);
    }
}
