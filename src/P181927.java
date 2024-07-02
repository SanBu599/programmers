import java.util.Arrays;

public class P181927 {
    public static void main(String[] args) {
        int[] num_list = {5,2,1,7,5};
        int[] answer = Arrays.copyOfRange(num_list,0,num_list.length+1);
        if(num_list[num_list.length-2] < num_list[num_list.length-1]){
            answer[num_list.length] = num_list[num_list.length-1]-num_list[num_list.length-2];
        }else{
            answer[num_list.length] = num_list[num_list.length-1]*2;
        }
        for (int a : answer){
            System.out.println(a);
        }
    }
}
