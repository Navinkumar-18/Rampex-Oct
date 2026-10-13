public class Throws {
    static void divide(int a,int b) throws ArithmeticException{
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Cannot be divided by zero");
        }
    }
    public static void main(String[] args) {
        divide(10, 0);
    }
}
