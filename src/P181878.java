public class P181878 {
    public static void main(String[] args) {
        String a = "AbCdEfG";
        String b = "aBc";
        if(a.toLowerCase().contains(b.toLowerCase())){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
