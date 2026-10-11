class MilageCalculator{
    void milage(double distance,double fuel){
          System.out.println(distance/fuel);
    }
    void cost(double distance,double milage,double price){
        System.out.println((distance/milage)*price);
    }
    void fuel(double  distance,double milage){
       System.out.println(distance/milage);
    }
}

public class milage {
    public static void main(String[] args) {
        MilageCalculator m=new MilageCalculator();
        m.milage(30,2);
        m.cost(30, 15.0, 108);
        m.fuel(40,10);
    }
}
