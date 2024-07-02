public class P181924 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3},{1,2},{1,4}};
        for(int i = 0 ; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
        }
        for (int d : arr){
            System.out.println(d);
        }
    }
}
