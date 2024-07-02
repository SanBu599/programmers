import java.util.*;

public class P120882 {
    public static void main(String[] args) {
        int[][] score = {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
        System.out.println(Arrays.toString(solution(score)));
    }
    public static int[] solution(int[][] score) {
        // 등수 매기기
        int n = score.length;
        ArrayList<Double> list = new ArrayList<>();
        for (int[] sc : score) {
            list.add((sc[0] + sc[1]) / 2.0);
        }
        int[] rank = new int[n];
        ArrayList<Double> sortedList = new ArrayList<>(list);
        System.out.println(sortedList);
        Collections.sort(sortedList, Collections.reverseOrder());
        System.out.println(sortedList);
        for (int i = 0; i < n; i++) {
            rank[i] = sortedList.indexOf(list.get(i)) + 1;
        }
        return rank;
    }
}
