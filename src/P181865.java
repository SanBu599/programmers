public class P181865 {
    public static void main(String[] args) {
        String a = "43 + 12";
        String[] b = a.split(" ");
        int answer = 0 ;
        switch (b[1]){
            case "+":
                answer = Integer.parseInt(b[0]) + Integer.parseInt(b[2]);
                break;
            case "-":
                answer = Integer.parseInt(b[0]) - Integer.parseInt(b[2]);
                break;
            case "*":
                answer = Integer.parseInt(b[0]) * Integer.parseInt(b[2]);
                break;
            case "/":
                answer = Integer.parseInt(b[0]) / Integer.parseInt(b[2]);
                break;
        }
        System.out.println(answer);
    }
}
