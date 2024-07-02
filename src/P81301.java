public class P81301 {
    public static final String[] words = {
            "zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine",};

    public static void main(String[] args) {
        String s =  "one4seveneight";
        int answer = 0;
        for (int i = 0; i <= s.length(); i++){
            answer = Integer.parseInt(s.replace(words[i],Integer.toString(i)));
            System.out.println(s);

        }

        System.out.println(s);
    }
}
