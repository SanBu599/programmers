public class P181896 {
    public static void main(String[] args) {
        // 첫 번째로 나온 음수
        int[] num_list = {12,4,15,46,38,-2,15};
        int answer = -1;
        for (int i = 0 ; i < num_list.length ; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
