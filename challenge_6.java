/*Write a Java program to create a greeting method and a method to read
  two numbers from the user, then print their sum. */
import java.util.Scanner;
public class challenge_6{
    public static void main(String[] args){
   greeting();
    int first = readNumber();
     int second= readNumber();

     int sum = first + second;
     System.out.print("your sum is = " + sum);
    }
    public static void greeting (){
    System.out.println("Good Morning..");
    }
    public static int readNumber(){ 
    Scanner input = new Scanner(System.in);
    System.out.print("please enter the  number: ");
    int number = input.nextInt();
    return number;
    
    }
    
 
}