public class P120845 {
    public static void main(String[] args) {
        // 주사위 개수
        int[] box = {10,8,6};
        int n = 3;
        int answer = solution(box,n);
        System.out.println(answer);
    }
    public static int solution(int[] box, int n) {
        int answer = 0;
        int a = box[0];
        int b = box[1];
        int c = box[2];
        answer = (a/n) * (b/n) * (c/n);
        return answer;
    }
}
