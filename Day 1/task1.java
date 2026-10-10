class rectangle{
    int length;
    int breadth;
    rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}
public class task1{
    public static void main(String[] args) {
        rectangle r1=new rectangle(10,20);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}