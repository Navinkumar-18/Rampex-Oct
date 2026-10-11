package Day2.ArrayList;
import java.util.*;
public class rotateRight {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
                a.add(sc.nextInt());
        }
        System.out.println(a);
        
            int last=a.get(a.size()-1);
            a.add(0,last);
            a.remove(a.size()-1);
        
        System.out.println(a);
    }
}
