package Day2.HashSet;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(10);
        h.add(30);
        h.add(20);
        System.out.println(h);
        System.out.println(h.contains(30));
        System.out.println(h.size());
    }
}
