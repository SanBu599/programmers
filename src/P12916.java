public class P12916 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        boolean answer = true;
        s = s.toLowerCase();
        int Pcount = 0;
        int Ycount = 0;
        for ( char c : s.toCharArray()){
            if(c == 'p'){
                Pcount++;
            } else if (c=='y') {
                Ycount++;
            }
        }
        if(Pcount!=Ycount){
            answer = false;
        }
        System.out.println("Pcount : "+Pcount);
        System.out.println("Ycount : "+Ycount);
    }
//    class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//
//        // 1. s를 소문자로 변환
//        s = s.toLowerCase();
//        // 2. p갯수 y갯수 구하기
//        int Pcount = 0;
//        int Ycount = 0;
//        for ( char c : s.toCharArray()){
//            if(c == 'p'){
//                Pcount++;
//            } else if (c=='y') {
//                Ycount++;
//            }
//        }
//        // 3. P갯수 Y갯수 같은 지 확인
//        if(Pcount!=Ycount){
//            answer = false;
//        }
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");
//
//        return answer;
//    }
//}
}
