public class P120843 {
    public static void main(String[] args) {
        // 공 던지기
        int[] numbers = {1,2,3};
        int k = 3;
        int answer = solution(numbers,k);
        System.out.println(answer);
    }
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        int j = 0;
        while ( j != k ){
            if (i < numbers.length){
                answer = numbers[i];
                j++;
                i+=2;
            } else {
                i = i - numbers.length;
                answer = numbers[i];
                j++;
                i+=2;
            }
        }
        return answer;
    }
}
