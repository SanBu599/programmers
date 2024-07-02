public class P120818 {
    public static void main(String[] args) {
        // 옷가게 할인 받기
        int price = 150000;
        int answer = soluction(price);
        System.out.println(answer);
    }
    public static int soluction(int price){
        int answer = 0;
        if(price >= 500000){
            answer = (int)(price*0.8);
        } else if (price >= 300000){
            answer = (int)(price*0.9);
        } else if (price >= 100000) {
            answer = (int)(price*0.95);
        } else {
            answer = price;
        }
        return answer;
    }
}
