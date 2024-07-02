import java.util.Arrays;

public class P120861 {
    public static void main(String[] args) {
        // 캐릭터의 좌표
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7,9};
        int[] answer = solution(keyinput,board);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(String[] keyinput, int[] board){
        int[] answer = new int[2];
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        for (String key : keyinput) {
            switch (key) {
                case "left":
                    if (answer[0] > -xLimit) {
                        answer[0] -= 1;
                    }
                    break;
                case "right":
                    if (answer[0] < xLimit) {
                        answer[0] += 1;
                    }
                    break;
                case "up":
                    if (answer[1] < yLimit) {
                        answer[1] += 1;
                    }
                    break;
                case "down":
                    if (answer[1] > -yLimit) {
                        answer[1] -= 1;
                    }
                    break;
            }
        }
        return answer;
    }
}
