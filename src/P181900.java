public class P181900 {
    public static void main(String[] args) {
        // 글자 지우기
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String[] strArr = my_string.split( "" );

        for ( int index : indices ) {
            strArr[ index ] = "";
        }

        System.out.println(String.join("", strArr));
    }
}
