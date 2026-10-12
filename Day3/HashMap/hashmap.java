package Day3.HashMap;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Goku");
        hm.put(2, "Ichigo");
        hm.put(3, "Luffy");
        hm.put(4, "Naruto");
        System.out.println(hm.get(4));
        hm.put(4, "Eren");
        System.out.println(hm.get(4));
        hm.remove(3);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("Ichigo"));
        System.out.println(hm.size());
        System.out.println(hm.get(105));
        System.out.println(hm.getOrDefault(105, "Not Found"));
        //Traverse the hashMap
        for(int key:hm.keySet()){
              System.out.println(key);
        }
        for(String name:hm.values()){
            System.out.println(name);
        }
        for(var entry:hm.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
