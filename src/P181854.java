public class P181854 {
    public static void main(String[] args) {
        int[] arr = {49,12,100,276,33};
        int n = 27;
        int[] answer = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            if (arr.length % 2 == 0 && i % 2 != 0) {
                answer[i] = arr[i] +n;
            } else if (arr.length % 2 != 0 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else{
                answer[i] = arr[i];
            }
            System.out.println(answer[i]);
        }
    }
}
