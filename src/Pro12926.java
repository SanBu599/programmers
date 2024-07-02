//public class Pro12926 {
//    public String solution(String s, int n) {
//        // 1. char[]를 생성
////        char[] a = new char[s.length()];
////        String answer = "";
////        // 2. s를 쪼개면서 바로 값 전환
////        for (int i = 0 ; i< s.length();i++){
////            // 3. 조건 1 = 대문자 확인 조건
////            if(s.charAt(i)>=65&&s.charAt(i)<=90){
////                // 4. Z로 끝나면 아스키 64로 변환후 계산
////                if(s.charAt(i)+1>90) {
////                    a[i] = (char) ((char)64+n);
////                }else {
////                    a[i] = (char) (s.charAt(i) + n);
////                }
////                // 5. 조건 2 = 소문자 확인 조건
////            }else if(s.charAt(i)>=97&&s.charAt(i)<=122){
////                // 6. z로 끝나면 아스키 96으로 변환 후 계산
////                if(s.charAt(i)+1>122){
////                    a[i] = (char) ((char)96+n);
////                }else{
////                    a[i] = (char) (s.charAt(i)+n);
////                }
////                // 7. 영소문자에 해당하지 않으면 그대로 출력
////            }else {
////                a[i] = s.charAt(i);
////            }
////            // 8. answer에 값 추가하기
////            StringBuilder sb = new StringBuilder(answer);
////            answer = sb.append(a[i]).toString();
////        }
////        return answer;
        class Solution1 {
            public String solution(String s, int n) {
                char[] carr = s.toCharArray();
                StringBuilder sb = new StringBuilder();
                for (char c : carr) {
                    char now;
                    if (Character.isAlphabetic(c)) {
                        if (Character.isUpperCase(c)) now = (char) ((c - 'A' + n) % 26 + 'A');
                        else now = (char) ((c - 'a' + n) % 26 + 'a');
                    } else now = c;
                    sb.append(now);
                }
                return sb.toString();
            }
        }
    
