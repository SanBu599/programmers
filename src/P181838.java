import java.time.LocalDate;

public class P181838 {
    public static void main(String[] args) {
        // 날짜 비교하기
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int answer = solution(date1,date2);
        System.out.println(answer);
    }
    public static int solution(int[] date1, int[] date2) {
//        String day1 = "";
//        String day2 = "";
//        for(int day : date1){
//            day1 += day+"";
//        }
//        for(int day : date2){
//            day2 += day+"";
//        }
//        return Integer.parseInt(day1)<Integer.parseInt(day2)?1:0;
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateA.isBefore(dateB)) {
            return 1;
        } else {
            return 0;
        }
    }
}
