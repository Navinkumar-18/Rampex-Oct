package Day5.Streams;

import java.util.*;

public class sorted {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(10,30,50,60,70,20,40);
        l.stream().sorted().forEach(n->System.out.print(n+" "));
    }
}
