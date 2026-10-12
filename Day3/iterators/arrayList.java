package Day3.iterators;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(10,25,30,15,50));
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
           if(it.next()%2==0){
            it.remove();
           }
        }
        System.out.println(arr);
    }
}
