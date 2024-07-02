import java.util.Arrays;

public class P120869 {
    public static void main(String[] args) {
        // 외계어 사전
        String[] spell = {"p","o","s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int answer = solution(spell,dic);
        System.out.println(answer);
    }
    public static int solution(String[] spell, String[] dic) {
        // spell 배열을 정렬한 문자열로 변환
        char[] spellArray = new char[spell.length];
        for (int i = 0; i < spell.length; i++) {
            spellArray[i] = spell[i].charAt(0);
        }
        Arrays.sort(spellArray);
        String sortedSpell = new String(spellArray);

        // dic의 각 단어를 정렬하여 비교
        for (String word : dic) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if (sortedSpell.equals(sortedWord)) {
                return 1; // 존재하는 경우
            }
        }
        return 2; // 존재하지 않는 경우
    }
}
