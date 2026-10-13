import java.util.*;
public class IllegalArgument {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();sc.close();
        if(age<0){
            throw new IllegalArgumentException("Negative Age");
        }
        if(age>100){
            throw new IllegalArgumentException("Age above 100");
        }
        System.out.println(age);
    }
}
