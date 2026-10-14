package Day5;
public class salary {
    public static void main(String[] args) {
        FullTime f=new FullTime("Arun");
        PartTime p=new PartTime("Bala",10,1000);
        f.calculateSalary();f.display();
        p.calculateSalary();p.display();
        
    }
}
interface Employee{
    void calculateSalary();
    void display();
}
class FullTime implements Employee{
    FullTime(String n){

    }
    int salary=0;
    public void calculateSalary(){
        salary=30000;
    }
    public void display(){
        System.out.println("Fixed Salary :"+salary);
    }
    
}
class PartTime implements Employee{
  String name;int hours,wages;int salary=0;
    PartTime(String name,int hr,int w){
         hours=hr;wages=w;
    }
    public void calculateSalary(){
          salary=hours*wages;
    }
    public void display(){
         System.out.println("Hourly Based Salary :"+salary);
    }
}
