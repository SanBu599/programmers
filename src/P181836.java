public class P181836 {
    public static void main(String[] args) {
        // 그림 확대
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." };
        int k = 2;
        String[] answer = solution(picture, k);
        for (String line : answer) {
            System.out.println(line);
        }
    }
//    public static String[] solution(String[] picture, int k) {
//        String[] answer = {};
//        for (String a : picture){
//            for (char b : a.toCharArray()){
//                for (int i = 0 ; i < k ; i++){
//                    System.out.print(b);
//                }
//            }
//            System.out.print("\n");
//        }
//        return answer;
//    }
public static String[] solution(String[] picture, int k) {
    int n = picture.length; // 행의 개수
    int m = picture[0].length(); // 열의 개수

    // 새로운 배열의 크기 계산
    int newN = n * k;
    int newM = m * k;

    // 새로운 배열 생성
    String[] newPicture = new String[newN];

    // 주어진 패턴을 k만큼 반복하여 새로운 배열 생성
    for (int i = 0; i < newN; i++) {
        StringBuilder line = new StringBuilder();
        for (int j = 0; j < newM; j++) {
            // 주어진 picture의 특정 위치의 문자를 가져와서 k번 반복하여 line에 추가
            line.append(picture[i / k].charAt(j / k));
        }
        newPicture[i] = line.toString();
    }

    return newPicture;
}
}
