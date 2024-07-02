public class P120863 {
    public static void main(String[] args) {
        // 다항식 더하기
        String polynomial = "3x + 7 + x";
        String answer = solution(polynomial);
        System.out.println(answer);
    }
    public static String solution(String polynomial){
        int x = 0;
        int constant = 0;
        String[] p = polynomial.split(" \\+ ");
        for (String str : p){
            str = str.trim();
            if (str.contains("x")){
                String coefficient = str.replace("x", "").trim();
                if (coefficient.isEmpty()){
                    x += 1;
                }else {
                    x += Integer.parseInt(coefficient);
                }
            }else {
                constant += Integer.parseInt(str);
            }
        }
        StringBuilder result = new StringBuilder();
        if (x != 0) {
            if (x == 1) {
                result.append("x");
            } else {
                result.append(x).append("x");
            }
        }

        if (constant != 0) {
            if (result.length() != 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        return result.toString();
    }
}
