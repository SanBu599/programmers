public class P181880 {
    public static void main(String[] args) {
        // 1로 만들기
        int[] num_list = {12,4,15,1,14};
        int result = solution(num_list);
        System.out.println(result);
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0 ; i < num_list.length ; i++){
            while (num_list[i] > 0){
                if(num_list[i]%2==0){
                    num_list[i]/=2;
                    answer++;
                } else{
                    num_list[i]-=1;
                }
            }
        }
        return answer;
    }
}
