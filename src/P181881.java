public class P181881 {
    public static void main(String[] args) {
        // 조건에 맞게 수열 변환하기 2
        int[] arr = {1, 2, 3, 100, 99, 98};
        int result = solution(arr);
        System.out.println(result);
    }
    public static int solution(int[] arr) {
        int count = -1;
        int[] nextArr = new int[arr.length];
        while(!isEqual(arr,nextArr)){
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    nextArr[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0){
                    nextArr[i] = arr[i] * 2 + 1;
                }
            }
            count++;
            arr = nextArr;
            nextArr = new int[arr.length];
        }
        return count;
    }
    private static boolean isEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
