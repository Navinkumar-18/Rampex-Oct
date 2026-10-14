package Day5.Streams;
import java.util.Arrays;
import java.util.List;
public class limit {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7);
        l.stream().limit(3).forEach(n->System.out.println(n));
    }
}
