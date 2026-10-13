package Day4.File_Handling;
import java.io.*;
public class createFile{
    public static void main(String[] args) {
        File file=new File("student.txt");
        try{
            file.createNewFile();
            System.out.println("File created successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}