package Day6.Threads;
class FirstRun extends Thread{
    @Override 
    public void run(){
       for(int i=0;i<=5;i++){
        System.out.print(i+" ");
       }
    }
}
class SecondRun extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.print("Hello ");
        }
    }
}
public class MyThread{
   public static void main(String[] args) {
    Thread t1=new FirstRun();
    Thread t2=new SecondRun();
    t1.start();t2.start();
   }
}
