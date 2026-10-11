package Day2.LinkedList;
import java.util.*;
public class linkedlist {
    public static void main(String[]  args){
        LinkedList<Integer> l=new LinkedList<>(Arrays.asList());
        l.add(10);
        l.add(20);
        l.add(30);
        l.addFirst(5);
        l.add(1,15);
        System.out.println(l.getFirst());//5
        System.out.println(l.getLast());//30
        System.out.println(l.get(1));//15
        l.removeFirst();//15 10 20 30
        l.removeLast();//15 10 20
        l.remove(1);//15 20
        System.out.println(l);
        l.clear();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l.contains(20));
        System.out.println(l.indexOf(30));
        l.set(1,15);
        System.out.println(l.size());
        l.clear();
        System.out.println(l.isEmpty());
    }
}
