import java.io.FileWriter;
import java.io.IOException;
public class writeFile{
    public static void main(String[] args){
        String fileName="java-course.txt";
        try(FileWriter writer = new FileWriter(fileName);){
             
            writer.write("This is the best Cource:");
            for(int i=0; i<=100; i++){
                 writer.write("*");
            }
            writer.flush();
            System.out.println("File Written Sucessfuly");

        }catch(IOException exception){
            System.out.printf("Exception Occureed %s",exception.getMessage());


        }

    }
}