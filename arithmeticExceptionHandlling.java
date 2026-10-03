import java.util.Scanner;
public class arithmeticExceptionHandlling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your First Number");
        int a = sc.nextInt();

        System.out.println("Please enter your Second Number");
        int b = sc.nextInt();
        try{
             int result = a/b;
        System.out.println(result);
        }
        catch(ArithmeticException exception){
            if(exception.getMessage()
            .equals("/ by zero")){
                 System.out.println("please enter correct value:");
            }
            
             
        }


    }
}