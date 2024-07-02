public class P72410 {
    public static void main(String[] args) {
        String new_id = "As";
        // 1. 소문자로 치환
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
        // 2. 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]","");
        System.out.println(new_id);
        // 3. .. 2번이상 연속되면 .하나로 치환
        new_id = new_id.replaceAll("\\.+",".");
        System.out.println(new_id);
        // 4. . 처음 or 끝에 존재하면 삭제
        new_id = new_id.replaceAll("^\\.+|\\.+$","");
        System.out.println(new_id);
        // 5. 빈 문자열이면 => 'a'로 대체
        if(new_id.isEmpty()) new_id ="a";
        System.out.println(new_id);
        // 6. 길이가 16이상이면 찻 15개 문자를 제외한 나머지 제거
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("\\.$","");
            System.out.println(new_id);
        } // 7. 길이가 2 이하면 마지막 문자를 길이가 3이될때까지 추가
        while (new_id.length()<=2){
            new_id += new_id.charAt(new_id.length()-1);
        }
        System.out.println(new_id);
    }
}
//class Solution {
//    public String solution(String new_id) {
//        String answer = "";
//        // 1. 소문자 치환
//        new_id = new_id.toLowerCase();
//        // 2. 소문자, 숫자, 뺴기, 밑줄, 마침표를 제외한 모든 문자 제거
//        new_id = new_id.replaceAll("[^a-z0-9\\-_.]","");
//        // 3. 마침표가 두번이상 연속되면 마침표 하나로 치환
//        new_id = new_id.replaceAll("\\.+",".");
//        // 4. 마침표가 처음 or 마지막에 존재하면 삭제
//        new_id = new_id.replaceAll("^\\.+|\\.+$","");
//        // 5. 빈 문자열이면 a로 대체
//        if ( new_id.isEmpty()) new_id = "a";
//        // 6. 길이가 16이상이면 첫 15개 문자를 제외한 나머지 삭제
//        if ( new_id.length() >= 16){
//            new_id = new_id.substring(0,15);
//            // 7. 마지막 글자가 마침표이면 삭제
//            new_id = new_id.replaceAll("\\.$","");
//        }
//        // 8. 길이가 2이하면 마지막문자를 길이가 3이될때까지 추가
//        while(new_id.length()<=2){
//            new_id += new_id.charAt(new_id.length()-1);
//        }
//        answer = new_id;
//        return answer;
//    }
//}
