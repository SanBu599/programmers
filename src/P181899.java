public class P181899 {
    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;
        int[] result = new int[start_num-end_num+1];
        for ( int i =0 ; i<=start_num-end_num ; i++){
            result[i] = start_num -i;
            System.out.println(result[i]);
        }
        System.out.println();
    }
}
