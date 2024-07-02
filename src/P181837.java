public class P181837 {
    public static void main(String[] args) {
        // 커피 심부름
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int answer = solution(order);
        System.out.println(answer);
    }
    public static int solution(String[] order) {
        int answer = 0;
        for (String a : order){
            if(a.contains("americano")||a.equals("anything")){
                answer+=4500;
            }else if(a.contains("cafelatte")){
                answer+=5000;
            }
        }
        return answer;
    }
}
