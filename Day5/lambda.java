package Day5;
//Lambda Expressions
//syntax :(parameters)->{expressions}
public class lambda {
    public static void main(String[] args) {
        Calculate c=(a,b)->(a+b);
        System.out.println(c.calculate(10, 20));
    }
}

interface Calculate {
  int calculate(int a,int b);
    
}