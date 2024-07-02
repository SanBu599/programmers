public class P181874 {
    public static void main(String[] args) {
        String a = "abstract algebra";
        for ( char c : a.toCharArray()){
            if(Character.toLowerCase(c)=='a'){
                c = Character.toUpperCase(c);
                System.out.println(Character.toString(c));
            }else{
                c = Character.toLowerCase(c);
                System.out.println(c);
            }
        }
    }
}
