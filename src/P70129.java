public class P70129 {
    public static void main(String[] args) {
        String s = "01110";
        int count = 0;
        for ( char c : s.toCharArray()){
            if(c == '0') count++;
            System.out.println(c);
        }
        System.out.println(count);
    }
}
