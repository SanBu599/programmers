public class P181905 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string.substring(s,e));
        String reverse = sb.reverse().toString();
        System.out.println(my_string.replace(my_string.substring(s,e+1),reverse));
        System.out.println(my_string);
        System.out.println(my_string.substring(s,e+1));
    }
}
