public class P181928 {
    public static void main(String[] args) {
        int[] num_list = {3,4,5,2,1};
        String even = "";
        String odd = "";
        for(int a : num_list){
            if( a % 2 == 0){
                even += a;
            } else{
                odd += a;
            }
        }
        System.out.println(Integer.parseInt(even)+Integer.parseInt(odd));
    }
}
