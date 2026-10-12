package Day3.HashMap;
import java.util.*;
public class countfrequency {
    public static void main(String[] args) {
        int[] arr={10,20,10,30,20,10};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr){
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put(a, 1);
                }
        }
        System.out.println(map);

    }
}
