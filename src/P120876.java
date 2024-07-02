import java.util.ArrayList;
import java.util.Arrays;

public class P120876 {
    public static void main(String[] args) {
        // 겹치는 선분의 길이
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int answer = solution(lines);
        System.out.println(answer);
    }

    //    public static int solution(int[][] lines) {
//        ArrayList<Integer> line1 = diff(lines[0]);
//        ArrayList<Integer> line2 = diff(lines[1]);
//        ArrayList<Integer> line3 = diff(lines[2]);
//        ArrayList<Integer> a1 = same(line1,line2);
//        ArrayList<Integer> a2 = same(line1,line3);
//        ArrayList<Integer> a3 = same(line2,line3);
//        return total(a1,a2,a3);
//    }
//    public static ArrayList<Integer> diff(int[] line){
//        int a = line[0];
//        int b = line[1];
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = a; i <= b ; i++){
//            list.add(i);
//        }
//        return list;
//    }
//    public static ArrayList<Integer> same(ArrayList<Integer> a1, ArrayList<Integer> a2){
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0 ; i < a2.size() ; i++){
//            if (a1.contains(a2.get(i))){
//                list.add(a2.get(i));
//            }
//        }
//        return list;
//    }
//    public static int total(ArrayList<Integer> a1, ArrayList<Integer> a2, ArrayList<Integer> a3){
//        int answer = 0;
//        if (!a1.isEmpty()&&!a2.isEmpty()&&!a3.isEmpty()){
//            int min = Math.min(a1.get(0),a2.get(0));
//            min = Math.min(min,a3.get(0));
//            int max = Math.max(a1.get(a1.size()-1),a2.get(a2.size()-1));
//            max = Math.max(max,a3.get(a3.size()-1));
//            for (int i = min; i < max ; i++){
//                answer += 1;
//            }
//        } else {
//            answer=0;
//        }
//        return answer;
//    }
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] lineSegments = new int[201]; // 선분의 최대 길이를 고려한 배열 크기 (예시에서 음수는 없으므로 200으로 가정)

        // 각 선분의 구간을 +1, -1로 표시
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            lineSegments[start]++;
            lineSegments[end]--;
        }


        // 스위핑 기법을 사용하여 두 개 이상의 선분이 겹치는 구간의 길이 계산
        int overlapCount = 0;
        for (int i = 0; i < lineSegments.length - 1; i++) {
            overlapCount += lineSegments[i];
            if (overlapCount > 1) {
                answer++;
            }
        }
        return answer;
    }
}