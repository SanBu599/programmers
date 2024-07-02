public class P181929 {
    public static void main(String[] args) {
        int[] a = {5,7,8,3};
        int answer = 0;
        int sum = 0;
        int t = 1;
        for(int b : a){
            sum += b;
            t *= b;
        }
        if(Math.pow(sum,2)>t){
            answer = 1;
        }
        System.out.println(answer);
    }
}

// Math.pow(2,2) == 거듭제곱 하는거 뒤에꺼에따라 제곱수 바뀜
