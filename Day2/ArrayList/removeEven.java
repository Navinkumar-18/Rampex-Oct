package Day2.ArrayList;
import java.util.*;
public class removeEven {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(2);
        a.add(6);
        a.add(4);
        System.out.println(a);
        for(int i=a.size()-1;i>=0;i--){
            if(a.get(i)%2==0){
                a.remove(a.get(i));
            }
        }
        System.out.println(a);

    }
}
