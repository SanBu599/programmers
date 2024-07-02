public class P181902 {
    public static void main(String[] args) {
        // 문자 개수 세기
        String my_string = "Programmers";
        int[] answer = new int[52];
        for ( char a : my_string.toCharArray()){
            if (a >= 'A' && a <= 'Z') {
                answer[a - 'A']++;
            }else if (a >= 'a' && a <= 'z') {
                answer[a - 'a' + 26]++;
            }
        }
        for (int i  : answer){
            System.out.println(i);
        }
    }
}
