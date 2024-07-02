import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution{
    public static void main(String[] args) throws Exception {

        String a = "abc";
        char[] arr = new char[a.length()];

        arr = a.toCharArray();
        for(char c : arr){

        }
//    String a = "z bc ";
//    int c = 1;
//    char[] b = new char[a.length()];
//    for(int i = 0 ; i < a.length(); i++){
//        b[i] = a.charAt(i);
////        System.out.println(!Character.isAlphabetic(b[i]));
//        if(!Character.isAlphabetic(b[i])){
//            b[i] = ' ';
//        }else{
//            if(a.charAt(i)=='z' || a.charAt(i)=='Z'){
//                b[i] = (char) ('a' -1 + c);
//            }else{
//                b[i] = (char) ((char) a.charAt(i)+c);;
//            }
//        }
//        System.out.print(b[i]);
//    }


//        String b = "A s df     z";
//        int d = 1;
//        char[] c = new char[b.length()];
//        for (int i = 0 ; i< b.length();i++){
//            if(b.charAt(i)>=65&&b.charAt(i)<=90){
//                if(b.charAt(i)+1>90) {
//                    c[i] = (char) ((char)64+d);
//                }else {
//                    c[i] = (char) (b.charAt(i) + d);
//                }
//            }else if(b.charAt(i)>=97&&b.charAt(i)<=122){
//                if(b.charAt(i)+1>122){
//                    c[i] = (char) ((char)96+d);
//                }else{
//                    c[i] = (char) (b.charAt(i)+d);
//                }
//            }else {
//                c[i] = b.charAt(i);
//            }
//
//        }
//        System.out.println(c);
//        char a = 'B';
//        System.out.println(a);
//        a = (char) (a + 1);
//        System.out.println(a);
//
    }
}


//    public int[] s(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (stack.size() == 0 || arr[i] != stack.peek()) stack.push(arr[i]);
//        }
//        int[] answer = new int[stack.size()];
//
//        for (int i = stack.size() - 1; i >= 0; i--) {
//            answer[i] = stack.pop();
//        }
//        return answer;
//    }

