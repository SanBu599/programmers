import java.util.Arrays;

public class P120866 {
    public static void main(String[] args) {
        // 안전지대
        int[][] board = {{0,0,1},{0,0,0},{0,0,0}};
        int answer = solution(board);
        System.out.println(answer);
    }
    public static int solution(int[][] board) {
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;
        int[][] newBoard = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    newBoard[i][j] = 1;
                    if (i > 0) {
                        newBoard[i-1][j] = 1;
                        if (j > 0) newBoard[i-1][j-1] = 1;
                        if (j < cols - 1) newBoard[i-1][j+1] = 1;
                    }
                    if (i < rows - 1) {
                        newBoard[i+1][j] = 1;
                        if (j > 0) newBoard[i+1][j-1] = 1;
                        if (j < cols - 1) newBoard[i+1][j+1] = 1;
                    }
                    if (j > 0) newBoard[i][j-1] = 1;
                    if (j < cols - 1) newBoard[i][j+1] = 1;
                }
            }
        }

        for (int[] row : newBoard) {
            for (int cell : row) {
                if (cell != 1) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
