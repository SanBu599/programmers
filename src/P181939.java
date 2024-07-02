public class P181939 {
    public static void main(String[] args) {
        int a = 89;
        int b= 8;
        int answer = 0;
        String c = a+"";
        String d = b+"";
        System.out.println(c+d);
        int e = Integer.parseInt(c+d);
        int f = Integer.parseInt(d+c);
        if(e<f){
            answer = answer + f;
        }else {
            answer += e;
        }
        System.out.println(answer);
    }
}
