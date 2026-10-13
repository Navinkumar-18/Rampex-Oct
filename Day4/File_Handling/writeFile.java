package Day4.File_Handling;
import java.io.*;
public class writeFile {
    public static void main(String[] args)  {
        try{
        FileWriter fw =new FileWriter("Onepiece.txt");
        fw.write("Long time no see, Mugiwara\n");
        fw.write("Onepiece is real");
        fw.close();
        System.out.println("Written succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
