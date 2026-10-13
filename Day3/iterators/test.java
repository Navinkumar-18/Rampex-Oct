package Day3.iterators;
import java.util.*;
public class test {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("Python","Kotlin","C","java"));
        Iterator<String> it=arr.iterator();
        while (it.hasNext()) {
            String n=it.next();
            if(n.length()<5){
                it.remove();
            }
        }
        System.out.println(arr);

    }
}
