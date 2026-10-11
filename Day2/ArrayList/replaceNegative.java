package Day2.ArrayList;
import java.util.*;
public class replaceNegative {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                arr.set(i,0 );
            }
        }
        System.out.println(arr);
        sc.close();
    }
}
