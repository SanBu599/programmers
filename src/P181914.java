import java.math.BigInteger;

public class P181914 {
    public static void main(String[] args) throws Exception{
        String n = "123";
        BigInteger bigInteger = new BigInteger(n);
        BigInteger remainder = bigInteger.mod(BigInteger.valueOf(9));
        int answer = Integer.parseInt(String.valueOf(remainder));
        System.out.println(remainder);
    }
}
