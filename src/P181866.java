import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P181866 {
    public static void main(String[] args) {
        String myString = "axb xcxdx";
        String[] parts = myString.replaceAll(" ","").split("x");
        List<String> resultList = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                resultList.add(part);
            }
        }
        Stream<String> b = resultList.stream().sorted();
        System.out.println(b.toArray(String[]::new));
    }
}
