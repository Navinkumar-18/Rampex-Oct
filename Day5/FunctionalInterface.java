package Day5;

public class FunctionalInterface {
    public static void main(String[] args) {
        Calc max=(a,b)->{
            if(a>b) return a;
            else return  b;
        };
        System.out.println(max.maxi(10, 20));
    }
}

interface Calc{
    int maxi(int a,int b);
}