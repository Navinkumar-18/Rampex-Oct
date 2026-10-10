class functions{
     void add(int a,int b){
       System.out.println(a+b);
     }
     void add(int a,int b,int c){
        System.out.println(a+b+c);
     }
     void sub(int a,int b){
        System.out.println(a-b);
     }
     void mul(int a,int b){
        System.out.println(a*b);
     }
     void mul(double a,double b){
        System.out.println(a*b);
     }
     void div(double a,double b){
        if(b==0){
            System.out.println("Cannot divided by zero");
        }else{
            System.out.println(a/b);
        }
     }
}

public class calculator {
    public static void main(String[] args) {
        functions c=new functions();
        c.add(10,20);
        c.add(10,20,30);
        c.sub(20,10);
        c.mul(10,5);
        c.mul(10,2.5);
        c.div(10,5);
    }
}
