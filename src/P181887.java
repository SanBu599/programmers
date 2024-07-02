import java.util.ArrayList;

public class P181887 {
    public static void main(String[] args) {
        // 홀수 vs 짝수
        int[] num_list = {4,2,6,1,7,6};
        P181887 solution = new P181887();
        int result = solution.solution(num_list);
        System.out.println("최대 합은: " + result);
    }

    public int solution(int[] num_list) {
        int answer = 0;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i <= num_list.length-1; i++) {
            if (i % 2 != 0) {
                odd.add(num_list[i]);
            } else {
                even.add(num_list[i]);
            }
        }
        int even_sum = 0;
        int odd_sum = 0;
        for (int ev : even) {
            even_sum += ev;
        }
        for (int od : odd) {
            odd_sum += od;
        }
        answer = Math.max(even_sum, odd_sum);
        return answer;
    }
}
