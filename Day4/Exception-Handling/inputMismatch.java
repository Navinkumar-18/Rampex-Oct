package Day4;
import java.util.*;
public class inputMismatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int  a=sc.nextInt();
            System.out.println("The given number is "+a);
        }catch(InputMismatchException e){
            System.out.println("Input must be a number ");
        }
        sc.close();
    }
}
