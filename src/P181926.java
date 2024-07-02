public class P181926 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        char[] controlArray = control.toCharArray();
        for (char c : controlArray) {
            switch (c) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        System.out.println(n);
    }
}
