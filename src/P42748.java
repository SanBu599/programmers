import java.util.Arrays;

public class P42748 {
    public static void main(String[] args) {
        // K번째수
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
    public static int[] solution(int[] array, int[][] commands) {
        int i = 0;
        int[] answer = new int[commands.length];
        for (int[] command : commands){
            int first = command[0];
            int last = command[1];
            int order = command[2];
            int[] result = Arrays.copyOfRange(array, first-1, last);
            Arrays.sort(result);
            answer[i] = result[order-1];
            i++;
        }
        return answer;
    }
}
