import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim().toUpperCase();
        int c = 1;
        for(int i = 0;i<a.length();i++){
            String b = Character.toString(a.charAt(i));
            switch (b){
                case "A": case "B": case "C":
                    c+=2;
                    break;
                case "D": case "E": case "F":
                    c+=3;
                    break;
                case "G": case "H": case "I":
                    c+=4;
                    break;
                case "J": case "K": case "L":
                    c+=5;
                    break;
                case "M": case "N": case "O":
                    c+=6;
                    break;
                case "P": case "Q": case "R": case "S":
                    c+=7;
                    break;
                case "T": case "U": case "V":
                    c+=8;
                    break;
                case "W": case "X": case "Y": case "Z":
                    c+=9;
                    break;
                default:
                    c+=0;
                    break;
            }
        }
        System.out.println(c+a.length()-1);
    }
}
