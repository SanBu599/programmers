import java.util.ArrayList;
import java.util.Arrays;

public class P181860 {
    public static void main(String[] args) {
        // 빈 배열에 추가, 삭제하기
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] result = solution(arr,flag);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int[] arr, boolean[] flag) {
        ArrayList< Integer > result = new ArrayList<>();
        for ( int i = 0; i < flag.length; i++ ) {
            if ( flag[ i ] ) {
                for ( int j = 0; j < arr[ i ] * 2; j++ ) {
                    result.add( arr[ i ] );
                }
            } else {
                for ( int j = 0; j < arr[ i ]; j++ ) {
                    result.remove( result.size() - 1 );
                }
            }
        }
        return result.stream().mapToInt( Integer :: intValue ).toArray();
    }
}
