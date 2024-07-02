import java.util.TreeMap;

public class P181851 {
    public static void main(String[] args) {
        // 전국 대회 선발 고사
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int result = solution(rank,attendance);
    }
    public static int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0 ; i < rank.length ; i++){
            if(attendance[i]){
                map.put(rank[i],i);
            }
        }
        int[] answer = new int[3];
        int index =0;
        for (Integer a : map.values()) {
            answer[index] = a;
            index++;
            if (index >= 3)
                break;
        }
        int result = 0;
        result += answer[0]*10000;
        result += answer[1]*100;
        result += answer[2];
        System.out.println(result);
        return result;
    }
}
