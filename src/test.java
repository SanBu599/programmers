import java.util.HashMap;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws Exception {
        // 1. a를 받는 이유는 몇번 돌지를 생각하는 거다
        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("주사위의 최댓값을 입력하세요 : ");
        int max = scanner.nextInt();
        // 3. 맵 호출
        HashMap<Integer, Integer> count = countNumber(a,max);
        // 4. 출력문을 클래스로 담아 표현하자
        for (int i = 1; i <= max; i++) {
            System.out.printf("%d은(는) %d번 나왔습니다.\n", i, count.get(i));
        }
    }

//        int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0;
//
//        for (int i = 0; i < a; i++) {
//            double b = Math.random() * 6;
//            if (b >= 0 && b < 1) {
//                r1++;
//            } else if (b >= 1 && b < 2) {
//                r2++;
//            } else if (b >= 2 && b < 3) {
//                r3++;
//            } else if (b >= 3 && b < 4) {
//                r4++;
//            } else if (b >= 4 && b < 5) {
//                r5++;
//            } else if (b >= 5 && b < 6) {
//                r6++;
//            }
//        }

//        System.out.printf("1은 %d번 나왔습니다.\n", r1);
//        System.out.printf("2은 %d번 나왔습니다.\n", r2);
//        System.out.printf("3은 %d번 나왔습니다.\n", r3);
//        System.out.printf("4은 %d번 나왔습니다.\n", r4);
//        System.out.printf("5은 %d번 나왔습니다.\n", r5);
//        System.out.printf("6은 %d번 나왔습니다.\n", r6);
//    }

    // 2. 1~6일때 1~6까지 갯수 세기
    private static HashMap<Integer, Integer> countNumber(int a, int max) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 1; i <= a; i++) {
            int b = (int)(Math.random() * max) + 1;
            if (count.containsKey(b)) {
                count.put(b, count.get(b) + 1); // 이미 존재하는 키라면 값에 1을 더해 발생 횟수를 증가시킵니다.
            } else {
                count.put(b, 1); // 그렇지 않다면 발생 횟수를 1로 초기화합니다.
            }
        }
        for (int i = 1; i <= max; i++) {
            count.putIfAbsent(i, 0);
        }
        System.out.println(count);
        return count;
    }
}


