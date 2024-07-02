import java.util.*;

public class P120896 {
    public static void main(String[] args) {
        // 한 번만 등장한 문자
        String s = "abdc";
        String answer = solution(s);
        System.out.println(answer);
    }
    public static String solution(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // 각 문자의 빈도 수 계산
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);
        // 한 번만 등장하는 문자를 추출
        List<Character> uniqueCharacters = new ArrayList<>();
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) == 1) {
                uniqueCharacters.add(c);
            }
        }

        // 사전 순으로 정렬
        Collections.sort(uniqueCharacters);

        // 정렬된 문자를 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : uniqueCharacters) {
            sb.append(c);
        }

        return sb.toString();
    }
}
