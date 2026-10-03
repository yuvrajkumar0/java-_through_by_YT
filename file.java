import java.io.FileWriter;
import java.io.IOException;
public class file{
    public static void main(String[] args){
        String fileName="java-course.txt";
        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the best Cource:");
            writer.flush();
            System.out.println("File Written Sucessfuly");

        }catch(IOException exception){
            System.out.printf("Exception Occureed %s",exception.getMessage());


        }

    }
}