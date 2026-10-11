package Day2.LinkedList;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            if(max<l.get(i)){
                 max=l.get(i);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
