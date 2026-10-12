package Day3.HashMap;
import java.util.*;
public class firstnonrepeat {
    public static void main(String[] args) {
       HashMap<Character,Integer> map=new HashMap<>();
       String s="aabbzce";
       char[] ch=s.toCharArray();
       for(char i:ch){
           if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
           }else{
                map.put(i, 1);
                
             }
           } 
           for(char c:ch){
              if(map.get(c)==1){
                 System.out.println(c);return;
           }
       }

    }}
