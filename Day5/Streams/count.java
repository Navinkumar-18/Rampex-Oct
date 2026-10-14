package Day5.Streams;
import java.util.Arrays;
import java.util.List;
public class count {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(10,10,20,30,20);
        int total=(int)l.stream().count();//count always returns a long datatype ..so we can convert the type to int
        System.out.println("Total:"+total);
        int dist=(int)l.stream().distinct().count();
        System.out.println("Distinct:"+dist);
    }
}
