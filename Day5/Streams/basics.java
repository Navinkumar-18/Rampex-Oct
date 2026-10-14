package Day5.Streams;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        List<Integer> mark=Arrays.asList(35,55,48,75,88);
        mark.stream().
        filter(marks->marks>=50).forEach(marks->System.out.println(marks));
    }
}
