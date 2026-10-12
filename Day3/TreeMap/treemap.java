package Day3.TreeMap;
import java.util.*;
public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<>();
        tmap.put(103, "Son goku");
        tmap.put(110, "Prince Vegeta");
        tmap.put(105, "Ichigo ");
        tmap.put(120,"Aizen");
        System.out.println(tmap.firstKey());
        System.out.println(tmap.lastKey());
        System.out.println(tmap.higherKey(105));
        System.out.println(tmap.lowerKey(105));
        System.out.println(tmap.descendingMap());

    }
}
