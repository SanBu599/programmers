import java.util.*;

public class P120852 {
    public static void main(String[] args) {
        // 소인수 분해
        
        int n = 420;
        int[] answer = solution(n);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int n) {
        // 소인수들을 저장할 집합을 생성 (중복 제거)
        Set<Integer> answerSet = new HashSet<>();

        // 2부터 n까지의 모든 정수 i에 대해 반복
        for (int i = 2; i <= n; i++) {
            // n이 i로 나누어 떨어질 동안 반복
            while (n % i == 0) {
                // i를 소인수 집합에 추가 (중복 제거)
                answerSet.add(i);
                // n을 i로 나누어 업데이트
                n /= i;
            }
        }
        List<Integer> answerList = new ArrayList<>(answerSet);
        answerList.sort(Integer::compare);

        // 집합을 배열로 변환
        int[] answer = new int[answerSet.size()];
        for (int i = 0 ; i < answerSet.size(); i++){
            answer[i] = answerList.get(i);
        }

        // 소인수 배열을 출력
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 소인수 배열을 반환
        return answer;
    }
}
