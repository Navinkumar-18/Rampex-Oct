package Day2.ArrayList;
import java.util.*;
public class removeEven {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(2,4,6,8,10));
        
        System.out.println(a);
        for(int i=0;i<a.size();i++){
            if(a.get(i)%2==0){
                a.remove(i);
                i--;//because after remove the element the one index got skipped if we  didnt declare i--;
            }
        }
        System.out.println(a);

    }
}
