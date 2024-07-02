public class P181882 {
    public static void main(String[] args) {
        // 조건에 맞게 수열 변환하기 1
        int[] arr = {1,2,3,100,99,98};
        int[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for ( int i = 0; i < arr.length ; i++){
            if(arr[i]>=50 && arr[i] % 2==0){
                answer[i] = arr[i] / 2;
            }else if(arr[i]<50 && arr[i] % 2 != 0){
                answer[i] = arr[i] * 2;
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
