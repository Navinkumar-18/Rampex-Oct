package Day2.LinkedList;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        boolean palindrome=true;
        int left=0;int right=n-1;
        while(left<right){
            if(l.get(left)!=l.get(right)){
                palindrome=false;
                break;
            }
            left++;right--;
        }
        System.out.println(palindrome?"Palindrome":"Not palindrome");
        sc.close();

    }
}
