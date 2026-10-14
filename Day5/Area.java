package Day5;
 interface AreaShape{
    void area(int num);
}
class Square implements AreaShape{
      public void area(int sq){
        System.out.println(sq*sq);
      }
}
 class Circle implements AreaShape{
    public void area(int rad){
        System.out.println(3.14*rad*rad);
    }
}
 class Area{
    public static void main(String[] args) {
        Square s=new Square();
        Circle c=new Circle();
        s.area(5);
        c.area(2);
    }
}
