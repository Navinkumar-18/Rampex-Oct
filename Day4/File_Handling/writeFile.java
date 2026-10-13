package Day4.File_Handling;
import java.io.*;
public class writeFile {
    public static void main(String[] args)  {
        //try with resources
        try(FileWriter fw =new FileWriter("Onepiece.txt")){
        fw.write("\nLong time no see, Naruto\n");
        fw.write("Rasengan\n");
        fw.write("I will the become Hokage of the Leaf");
        System.out.println("Written succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
        //if already irukara file la append pannanum na ...
        //FileWriter fw=new FileWriter("file.txt",true);
    }
}
