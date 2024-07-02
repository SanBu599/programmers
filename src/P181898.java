public class P181898 {
    public static void main(String[] args) {
        // 가까운 1찾기
        int[] arr = {1,1,1,1,0};
        int idx = 3;
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && i >= idx) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
