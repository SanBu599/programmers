public class P181864 {
    public static void main(String[] args) {
        String a = "ABBAA";
        String b = "AABB";
        String answer = "";
        char[] c = a.toCharArray();
        for (char d : c) {
            if(d == 'A'){
                answer += "B";
            }else{
                answer += "A";
            }
        }
        if(answer.contains(b)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
