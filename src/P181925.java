public class P181925 {
    public static void main(String[] args) {
        int[] numLog = { 0,1,0,10,0,1,0,-1,-2,-1};
        String answer = "";
        for (int i = 0 ; i < numLog.length-1;i++){
            System.out.println((numLog[i + 1] - numLog[i]));
            switch (numLog[i + 1] - numLog[i]) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                case 10:
                    answer += "d";
                case -10:
                    answer += "a";
            }
        }
        System.out.println(answer);
    }
}
