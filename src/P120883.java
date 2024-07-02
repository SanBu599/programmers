public class P120883 {
    public static void main(String[] args) {
        // 로그인 성공?
        String[] id_pw = {"abc04", "345"};
        String[][] db = {{"abc04", "335"}, {"abc03", "345"}};
        System.out.println(solution(id_pw,db));
    }
    public static String solution(String[] id_pw, String[][] db) {
        String idCheck = id_pw[0];
        String pwCheck = id_pw[1];
        for (String[] data : db){
            if (data[0].equals(idCheck)) {
                if (data[1].equals(pwCheck)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}
