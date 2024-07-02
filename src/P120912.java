public class P120912 {
    public static void main(String[] args) {
        // 7의 개수
        int[] array = {10,29};
        int answer = solution(array);
        System.out.println(answer);
    }
    public static int solution(int[] array){
        int answer = 0;
        for (int arr : array){
            for (char ch : String.valueOf(arr).toCharArray()){
                if (String.valueOf(ch).equals("7")){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
