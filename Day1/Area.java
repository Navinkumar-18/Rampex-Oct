public class Area {
    static int area(int sq){
        return sq*sq;
    }
    static int area(int length,int breadth){
        return length*breadth;
    }
    static double area(double rad){
        return  (double)3.14*rad*rad;
    }
    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(10,20));
        System.out.println(area(2.5));
    }
}
