package Day2.TreeSet;
import java.util.*;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(10);
        t.add(50);
        t.add(5);
        t.add(30);
        t.add(20);
        System.out.println(t);
        System.out.println(t.contains(30));
        System.out.println(t.size());
    }
}
