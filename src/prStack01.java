import java.util.Stack;

public class prStack01 {
    public static void main(String[] args) {
        int[] a = {93,30,55};
        int[] b = {1,30,5};
        int[] c = new int[a.length];
        for(int i = 0 ; i<a.length;i++){
            while (a[i]<100){
                c[i] += 1;
                a[i] += b[i];
            }
        }
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (c[i]>c[i+1]){

        }

    }
}

