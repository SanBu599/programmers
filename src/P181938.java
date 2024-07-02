public class P181938 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        int c = Integer.parseInt(a+""+b);
        int d = 2 * a * b;
        System.out.println(Math.max(c,d));
    }
}
