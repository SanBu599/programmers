public class P181934 {
    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;
        int answer = 0;
        if(ineq.equals("<") && eq.equals("=")){
            if(n<=m){
                answer += 1;
            }
        }else if(ineq.equals("<") && eq.equals("!")){
            if(n<m){
                answer += 1;
            }
        }else if(ineq.equals(">") && eq.equals("=")){
            if(n>=m){
                answer += 1;
            }
        }else if(ineq.equals(">") && eq.equals("!")){
            if(n>m){
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
