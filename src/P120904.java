public class P120904 {
    public static void main(String[] args) {
        // 숫자 찾기
        int num = 232443;
        int k = 4;
        int answer = solution(num,k);
        System.out.println(answer);
    }
    public static int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        int i = 0;
        for (char ch : str.toCharArray()){
            i++;
            if(Integer.parseInt(String.valueOf(ch))==k){
                answer = i;
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}
