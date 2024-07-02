public class P181875 {
    public static void main(String[] args) {
        String[] arr = {"AAA","BBB","CCC","DDD"};
        String[] answer = {};
        for(int i = 0 ; i < arr.length;i++){
            if(i%2==0){
                answer[i] = arr[i].toLowerCase();
            }else{
                answer[i] = arr[i].toUpperCase();
            }
        }
    }
}
