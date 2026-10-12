package Day3.HashMap;
import java.util.*;
public class mostfreq{
    public static void main(String[] args) {
        int[] arr={4,1,4,2,4,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr){
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put(a, 1);
                }
        }
        int max=Integer.MIN_VALUE;
        for(int key:map.keySet()){
            if(max<map.get(key)){
                  max=map.get(key);
            }
        }
       for(var entry:map.entrySet()){
          if(entry.getValue().equals(max)){
                System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
          }
       }

    }
}