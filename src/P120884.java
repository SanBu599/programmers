public class P120884 {
    public static void main(String[] args) {
        // 치킨 쿠폰
        int chicken = 100;
        System.out.println(solution(chicken));
    }
    public static int solution(int chicken) {
        int serviceChicken = 0; // 서비스 치킨 수
        int coupons = chicken; // 초기 쿠폰 수는 시켜먹은 치킨 수와 동일

        while (coupons >= 10) {
            int newChickens = coupons / 10; // 쿠폰을 10개 사용하여 받을 수 있는 새로운 치킨 수
            serviceChicken += newChickens; // 서비스 치킨 수에 추가
            coupons = coupons % 10 + newChickens; // 남은 쿠폰 수 + 새로운 치킨으로 받은 쿠폰 수
        }
        return serviceChicken;
    }
}
