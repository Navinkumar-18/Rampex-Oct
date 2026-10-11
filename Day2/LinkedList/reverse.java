package Day2.LinkedList;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        LinkedList<Integer> l2=new LinkedList<>();
        for(int i=0;i<n;i++){
            l2.add(l1.getLast());
            l1.remove(l1.getLast());
        }
        System.out.println(l2);
        sc.close();
      
    }
}
