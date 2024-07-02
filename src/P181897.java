import java.util.ArrayList;

public class P181897 {
    public static void main(String[] args) {
        // 리스트 자르기
        int n = 2;
        int[] slicer = {0,1,1};
        int[] num_list = {10,8,6,4,2};
        ArrayList<Integer> answer = new ArrayList<>();

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n){
            case 1:
                for (int i = 0 ; i <= b ; i ++){
                    answer.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a ; i < num_list.length ; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a ; i <= b ; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = a; i <= b ; i+=c){
                    answer.add(num_list[i]);
                }
                break;
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        System.out.println(answer);
    }
}
