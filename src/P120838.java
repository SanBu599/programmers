import java.util.HashMap;

public class P120838 {
    public static void main(String[] args) {
        // 모스부호(1)
        String letter = ".... . .-.. .-.. ---";
        String answer = morseToText(letter);
        System.out.println(answer);

    }
    private static final HashMap<String, String> morseDict = new HashMap<>();
    static {
        morseDict.put(".-", "a");
        morseDict.put("-...", "b");
        morseDict.put("-.-.", "c");
        morseDict.put("-..", "d");
        morseDict.put(".", "e");
        morseDict.put("..-.", "f");
        morseDict.put("--.", "g");
        morseDict.put("....", "h");
        morseDict.put("..", "i");
        morseDict.put(".---", "j");
        morseDict.put("-.-", "k");
        morseDict.put(".-..", "l");
        morseDict.put("--", "m");
        morseDict.put("-.", "n");
        morseDict.put("---", "o");
        morseDict.put(".--.", "p");
        morseDict.put("--.-", "q");
        morseDict.put(".-.", "r");
        morseDict.put("...", "s");
        morseDict.put("-", "t");
        morseDict.put("..-", "u");
        morseDict.put("...-", "v");
        morseDict.put(".--", "w");
        morseDict.put("-..-", "x");
        morseDict.put("-.--", "y");
        morseDict.put("--..", "z");
    }
    public static String morseToText(String morseCode) {
        String[] words = morseCode.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String test : words){
            answer.append(morseDict.get(test));
        }
//        StringBuilder translatedText = new StringBuilder();
//
//        for (String word : words) {
//            String[] letters = word.split(" ");  // 각 단어는 1개의 공백으로 문자로 분리됨
//            for (String letter : letters) {
//                translatedText.append(morseDict.getOrDefault(letter, ""));  // 딕셔너리에서 문자를 찾아 추가
//            }
//            translatedText.append(" ");  // 각 단어 사이에 공백 추가
//        }

//        return translatedText.toString().trim();  // 마지막 공백 제거 후 반환
        return String.valueOf(answer);
    }
}
