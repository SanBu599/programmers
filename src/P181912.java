import java.util.ArrayList;

public class P181912 {
    public static void main(String[] args) {
        // 배열만들기
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for (String intStr : intStrs){
            if(Integer.parseInt(intStr.substring(s,s+l)) > k){
                list.add(Integer.parseInt(intStr.substring(s,s+l)));
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
    }
}