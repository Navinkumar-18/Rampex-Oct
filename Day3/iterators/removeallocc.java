package Day3.iterators;
import java.util.*;
public class removeallocc {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(
            Arrays.asList(10,20,10,40,50,10)
        );
        Iterator<Integer>it=arr.iterator();
        while (it.hasNext()) {
            if(it.next()==10){
                it.remove();
            }
        }
        System.out.println(arr);

    }
}
