public class P120924 {
    public static void main(String[] args) {
        // 다음에 올 숫자
        int[] common = {1,2,3,4};
        System.out.println(solution(common));
        int[] common1 = {2, 4, 8};
        System.out.println(solution(common1));

    }
    public static int solution(int[] common) {
        int answer = 0;
        int a = 0;
        String st = "";
        if(common[1] - common[0] == common[2] - common[1]){
            a = common[1] - common[0];
            st = "등차";
        } else if (common[1] % common[0] == common[2] % common[1]) {
            a = common[1] / common[0];
            st = "등비";
        }
        if (st.equals("등차")){
            answer = common[common.length-1]+a;
        } else if (st.equals("등비")) {
            answer = common[common.length-1]*a;
        }
        return answer;
    }
}
