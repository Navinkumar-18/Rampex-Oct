package Day3.HashMap;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String s1="listen";String s2="silent";
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0)+1);
            map.put(c2, map.getOrDefault(c2,0)-1);
        }
        boolean anagram=true;
        for(int i:map.values()){
            if(i!=0){
              anagram=false;break;
            }
        }
        System.out.println(anagram?"Strings are anagram":"Not anagrams");

    }
}
