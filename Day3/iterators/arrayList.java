package Day3.iterators;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
