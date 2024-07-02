import java.io.*;

public class average {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int d[] = new int[a];
        int max = 0;
        double total = 0;
        String[] c = b.split(" ");
        int sum = 0;
        for (int i = 0 ; i<a ; i++){
            d[i]= Integer.parseInt(c[i]);
            sum += d[i];
            if(max<d[i]){
                max = d[i];
            }
        }
        total = sum * 100.0 / max / a;
        System.out.println(total);
    }
}
