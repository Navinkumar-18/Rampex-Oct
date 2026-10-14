package Day5;

interface OddorEven{
    void check(int a);
}
public class oddEven {
    public static void main(String[] args) {
        OddorEven c=(a)->{
              if(a%2==0) System.out.println("Even");
              else System.out.println("Odd");
        };
        c.check(9);
    }
}
