package Day5;

public class add {
    public static void main(String[] args) {
        Calculator add=new Addition();
        System.out.println(add.calculate(10, 20));
    }
}

interface Calculator{
    int calculate(int a,int b);
}
class  Addition implements Calculator{
    public int calculate(int a,int b){
        return a+b;
    }
}