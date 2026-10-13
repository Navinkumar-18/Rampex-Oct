package Day4.File_Handling;
import java.io.*;
public class createFile{
    public static void main(String[] args) {
        File file=new File("Onepiece.txt");
        System.out.println(file.exists());
        try{
            if(file.createNewFile()){
                System.out.println("File created "+file.getName());
            }else{
                System.out.println("Already exists");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        // file.delete();
        System.out.println(file.exists());
    }
}