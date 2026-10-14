package Day5.Streams;

import java.util.Arrays;
import java.util.List;

public class distinct {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(10,10,20,30,20);
        l.stream().distinct().forEach(n->System.out.println(n));
    }
}
