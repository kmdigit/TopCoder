import java.util.Arrays;
import java.util.stream.Collectors;

public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
         if (rights.length == 0) return "";
         return Arrays.stream(rights).mapToObj(x -> x < minPermission ? "D" : "A" ).collect(Collectors.joining(""));
     }
}
