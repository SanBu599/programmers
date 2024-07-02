public class P120868 {
    public static void main(String[] args) {
        // 삼각형의 완성조건 (2)
        int[] sides = {11,7};
        int answer = solution(sides);
        System.out.println(answer);
    }
    public static int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        // max 가 제일 큰 경우
        for (int i = 0 ; i <= max ;i++){
            if (max<min+i){
                answer+=1;
            }
        }
        // j 가 제일 큰 경우
        int j = max+1;
        while (j<max+min){
            j++;
            answer+=1;
        }
        return answer;
    }
}
