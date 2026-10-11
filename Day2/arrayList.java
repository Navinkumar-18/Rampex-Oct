package Day2;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>marks=new ArrayList<>();
        //methods
        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.addFirst(0);
        marks.addLast(85);
       System.out.println(marks);
       marks.set(1, 88);
       System.out.println(marks);
       marks.remove(0);
       System.out.println(marks);
       System.out.println(marks.get(0));
       System.out.println(marks.size());
       System.out.println(marks.contains(90));
       System.out.println(marks.isEmpty());
       marks.clear();
       System.out.println(marks.isEmpty());

    }
}
