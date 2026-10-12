package Day3.HashMap;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] arr={2,7,11,15};
        int target=9;
        for(int i=0;i<arr.length;i++){
             if(map.containsKey(target-arr[i])){
                System.out.println(map.get(target-arr[i])+" "+i);return;
             }

            map.put(arr[i], i);
        }
       
    }
}
