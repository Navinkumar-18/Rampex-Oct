class account{
      String name;
      int amount;
      account(String name,int amount){
            this.name=name;
            this.amount=amount;
      }
      void deposit(int amt){
        amount+=amt;
      }
      void withdraw(int amt){
        amount-=amt;
      }
      void balance(){
        System.out.println(amount);
      }
}
public class task2 {
    public static void main(String[] args) {
        account a1=new account("Navin", 2000);
        a1.deposit(1000);
        a1.balance();
        a1.withdraw(500);
        a1.balance();
    }
}
