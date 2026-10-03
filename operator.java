 
import java.util.Scanner;
public class operator{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your four cmd: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double paramater = a + b + c + d;
          System.out.println("your paramater addition is: " + paramater);

    }
}