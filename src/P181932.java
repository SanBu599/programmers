public class P181932 {
    public static void main(String[] args) {
        String code = " ";
        String answer = "";
        int mode = 0;
        char[] a = code.toCharArray();
        for(int i = 0; i<a.length;i++){
            if(mode == 0){
                if (a[i]=='1'){
                    mode = 1;
                } else if(i % 2 ==0){
                    if(a[i]==' '){
                        answer = "";
                    }else{
                        answer += a[i];
                        System.out.println("모드0"+answer);
                    }
                }
//                if (i%2==0) {
//                    answer += a[i];
//                    System.out.println("모드0"+answer);
//                } else if (a[i]=='1'){
//                    mode = 1;
//                }
            } else {
                if(a[i]=='1'){
                    mode = 0;
                } else if(i % 2 != 0){
                    answer += a[i];
                    System.out.println("i의 값"+i);
                }
//                if (i%2!=0) {
//                    answer += a[i];
//                    System.out.println("모드1"+answer);
//                } else if (a[i]=='1'){
//                    mode = 0;
//                }
            }
        }
        if(answer.equals("")){
            answer = "EMPTY";
        }
        System.out.println(answer);
    }
}
