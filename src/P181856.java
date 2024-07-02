public class P181856 {
    public static void main(String[] args) {
        // 배열 비교하기
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 3, 3, 3, 3};
        int answer = solution(arr1,arr2);
        System.out.println(answer);
    }
    public static int solution(int[] arr1, int[] arr2){
        if (arr1.length>arr2.length){
            return 1;
        } else if (arr1.length<arr2.length) {
            return -1;
        } else {
            int arr1Sum = 0;
            int arr2Sum = 0;
            for (int i = 0 ; i < arr1.length ; i++){
                arr1Sum += arr1[i];
                arr2Sum += arr2[i];
            }
            if (arr1Sum>arr2Sum){
                return  1;
            } else if (arr1Sum<arr2Sum) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
