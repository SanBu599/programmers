public class P120885 {
    public static void main(String[] args) {
        // 이진수 더하기
        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1,bin2));
    }
    public static String solution(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = bin1.length()-1;
        int j = bin2.length()-1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // 먼저 올림수를 더함

            if (i >= 0) {
                sum += bin1.charAt(i) - '0'; // a의 현재 자리 숫자를 더함
                i--; // 다음 자리로 이동
            }

            if (j >= 0) {
                sum += bin2.charAt(j) - '0'; // b의 현재 자리 숫자를 더함
                j--; // 다음 자리로 이동
            }

            result.append(sum % 2); // 현재 자리에 대한 결과를 저장
            carry = sum / 2; // 다음 자리에 대한 올림수를 계산
        }

        return result.reverse().toString(); // 결과를 뒤집어 올바른 순서로 반환
    }
}
