package Day4;

public class exceptionhandling {
    public static void main(String[] args) {
        int a =10,b=0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
}
