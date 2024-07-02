public class P120837 {
    public static void main(String[] args) {
        // 개미 군단
        int hp = 25;
        int answer = solution(hp);
        System.out.println(answer);
    }
    public static int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int work = 1;
        answer += hp / general;
        hp = hp%general;
        answer += hp / soldier;
        hp = hp % soldier;
        answer += hp / work;
        hp = hp % work;
        return answer;
    }
}
