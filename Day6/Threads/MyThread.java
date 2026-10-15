package Day6.Threads;
class Run extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class MyThread{
   public static void main(String[] args) {
    Thread t=new Run();
    t.start();
   }
}
