import java.util.*;

class P181921 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int count = 0; // 조건에 맞는 숫자의 개수를 세는 변수

        // l부터 r까지의 모든 숫자를 확인하면서 조건에 맞는 숫자를 찾음
        for(int i = l ; i<= r; i+=5){
            if(String.valueOf(i).matches("[05]+")){
                answerList.add(i); // 조건에 맞는 숫자를 ArrayList에 추가
                count++; // 조건에 맞는 숫자 개수 증가
            }
        }

        // 조건에 맞는 숫자가 없을 경우 -1이 담긴 배열을 반환
        if(answerList.isEmpty()){
            return new int[]{-1};
        } else {
            // 조건에 맞는 숫자를 저장할 배열을 선언
            int[] answer = new int[count];

            // ArrayList에 있는 숫자를 배열에 복사
            for (int i = 0; i < count; i++) {
                answer[i] = answerList.get(i);
            }

            return answer;
        }
    }
}
