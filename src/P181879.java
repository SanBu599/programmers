public class P181879 {
    public static void main(String[] args) {
        // 길이에 따른 연산
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int result = solution(num_list);
        System.out.println(result);
    }
    public static int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length>=11){
            for (int num : num_list){
                answer += num;
            }
            answer -= 1;
        }else{
            for (int num : num_list){
                answer *= num;
            }
        }
        return answer;
    }
}
