public class P120834 {
    public static void main(String[] args) {
        // 외계행성의 나이
        int age = 23;
        String answer = solution(age);
        System.out.println(answer);
    }
    public static String solution(int age) {
        String answer = "";
        String strAge = age +"";
        for (char a : strAge.toCharArray()){
            switch (a){
                case '0':
                    answer += 'a';
                    break;
                case '1':
                    answer += 'b';
                    break;
                case '2':
                    answer += 'c';
                    break;
                case '3':
                    answer += 'd';
                    break;
                case '4':
                    answer += 'e';
                    break;
                case '5':
                    answer += 'f';
                    break;
                case '6':
                    answer += 'g';
                    break;
                case '7':
                    answer += 'h';
                    break;
                case '8':
                    answer += 'i';
                    break;
                case '9':
                    answer += 'j';
                    break;
            }
        }
        return answer;
    }
}
