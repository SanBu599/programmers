import java.util.HashMap;

public class P181855 {
    public static void main(String[] args) {
        // 문자열 묶기
        String[] strArr = {"a","bc","d","efg","hi"};
        int answer = solution(strArr);
        System.out.println(answer);
    }
    public static int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < strArr.length ; i++){
            if(!map.containsKey(strArr[i].length())){
                map.put(strArr[i].length(), 1);
            } else {
                int v = map.get(strArr[i].length());
                map.put(strArr[i].length(), v + 1);
            }
        }
        int max = 1;
        for(Integer key :  map.keySet()){

            if(map.get(key)>max){
                max = map.get(key);
            }

        }
        answer = max;
        return answer;
    }
}
