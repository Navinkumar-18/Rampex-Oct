package Day5;
/**
 * Greeting
 */
interface Greeting {
      void hello();  
    
}
class C implements Greeting{
    public void hello(){
        System.out.println("Hello");
    }
}

public class interFace {
    public static void main(String[] args) {
        C greet=new C();
        greet.hello();
    }
}
