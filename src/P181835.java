public class P181835 {
    public static void main(String[] args) {
        // 조건에 맞게 수열 변환하기 3
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        int[] answer = solution(arr,3);
        for (int a : answer){
            System.out.println(a);
        }
    }
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int i = 0;
        for (int a : arr){
            if(k%2!=0){
                answer[i] = a*k;
                i++;
            }else{
                answer[i] = a+k;
                i++;
            }
        }
        return answer;
    }
}
