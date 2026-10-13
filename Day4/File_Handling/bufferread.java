package Day4.File_Handling;
import java.io.*;
public class bufferread {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("Onepiece.txt"))){
            String line;
             while((line=br.readLine())!=null){
                System.out.println(line);
             }
        }
    }
}
