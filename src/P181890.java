import java.util.ArrayList;

public class P181890 {
    public static void main(String[] args) {
        // 왼쪽 오른쪽
        String[] str_list = {"r","u","d","d"};
        ArrayList<String> answer = new ArrayList<>();
        int l = -1;
        int r = -1;
        for (int i = 0 ; i < str_list.length;i++){
            if(str_list[i].equals("l")){
                l = i;
                System.out.println(l);
                break;
            } else if(str_list[i].equals("r")){
                r = i;
                System.out.println(r);
                break;
            }
        }
        if (l >= 0) {
            for (int i = 0; i < l ; i++) {
                answer.add(str_list[i]);
            }
        } else if (r >= 0) {
            for (int i = r+1; i < str_list.length; i++) {
                answer.add(str_list[i]);
            }
        } else {
            String[] result = {};
        }
//        for (int i = 0 ; i < l; i++){
//            answer.add(str_list[i]);
//            if(answer.isEmpty()){
//                result = new String[]{};
//            }
//        }
        String[] result = new String[answer.size()];
        for (int i = 0 ; i < answer.size() ; i ++){
            result[i] = answer.get(i);
        }
        System.out.println(answer);
    }
}
// 10 11 13 14 15 17 20
