import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class RobustFileReader{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String fileName= input.nextLine();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read())!=-1){
                System.out.print((char)read);
            }
          }catch(IOException exception){
        System.out.printf("Exception Occurred: %s",exception.getMessage());
        }
    }
}