package Day4;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4};
        try{
             int index=sc.nextInt();
             int num=sc.nextInt();
             System.out.println(arr[index]/num);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Input should be a number");
        }
        sc.close();
    }
}

