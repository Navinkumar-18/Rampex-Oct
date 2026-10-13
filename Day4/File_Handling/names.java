package Day4.File_Handling;
import java.io.*;import java.util.*;
public class names {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        try(FileWriter fw=new FileWriter("names.txt")){
            for(int i=1;i<=5;i++){
                String s=sc.nextLine();
                fw.write(s+"\n"); 
            }
            System.out.println("Successfully written");
        }catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
