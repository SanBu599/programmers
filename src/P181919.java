import java.util.ArrayList;

public class P181919 {
    public static void main(String[] args) {
        // 콜라츠 수열 만들기
        int n = 10;
        ArrayList<Integer> test = new ArrayList<>();
        test.add(n);
        while ( n != 1 ){
            if( n % 2== 0){
                n= n / 2;
                test.add(n);
                System.out.println("1번 결과 : "+n);
            } else {
                n = 3 * n + 1;
                test.add(n);
                System.out.println("2번 결과 : "+n);
            }
        }
        int[] answer = new int[test.size()];
        for (int i = 0; i < test.size(); i++) {
            answer[i] = test.get(i);
        }
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
