class Animal{
   void sound(){
    System.out.println("Animal makes sound");
   } 
}
 class Dog extends Animal {
    void sound(){
        System.out.println("Bow Bow");
     }
}

public class overriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
