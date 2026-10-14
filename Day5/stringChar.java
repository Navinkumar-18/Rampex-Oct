package Day5;
interface WhattoDo{
    void check(String str);
}
public class stringChar {
    public static void main(String[] args) {
         WhattoDo s=(str)->{
        if(str.length()>5) System.out.println("String has more than 5 characters");
        else System.out.println("The string has less 5 characters");
    };
    s.check("Gojo Satoru");

    }
   
}
