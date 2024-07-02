public class P120890 {
    public static void main(String[] args) {
        // 가까운 수
        int[] array = {3,1};
        int n = 2;
        int answer = solution(array,n);
        System.out.println(answer);
    }
    public static int solution(int[] array, int n) {
        int answer = array[0];
        int minDifference = Math.abs(array[0] - n);

        for (int a : array){
            int currentDifference = Math.abs(a - n);
            if (currentDifference < minDifference || (currentDifference == minDifference && a < answer)) {
                minDifference = currentDifference;
                answer = a;
            }
        }
        return answer;
    }
}