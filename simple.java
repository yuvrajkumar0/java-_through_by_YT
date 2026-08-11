import java.util.Scanner;
public class simple{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" please enter your 1st number: ");
        int number1 = input.nextInt();
        System.out.print(" please enter your 2nd number: ");
        int number2 = input.nextInt();
         System.out.print(" please enter your 3rd number: ");
        int number3= input.nextInt();
       if(number1>number2 && number1<number3){
        System.out.print("your number is large: " + number1);
       }else if(number2>number1 && number2>number3){
        
       System.out.print("  your number is large " + number2);
       }else if(number3>number1 && number3>number2){
        System.out.print("  your number is large " + number3);
       }else{
        System.out.print(" please enter your write number ");
       }
       
    }
}
 


