import java.util.*;

public class Throw {
         public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();sc.close();
            if(age<18){
                throw new IllegalArgumentException("Age must be 18");
            }
            System.out.println("Eligible");
         }
}
