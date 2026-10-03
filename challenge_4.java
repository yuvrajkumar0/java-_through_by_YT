// This program takes the user's name and age as input.
// It greets the user with "Good Morning" and displays the entered age.
import java.util.Scanner;
public class challenge_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("please enter your name:");
        String name = input.nextLine();
        
        System.out.println(name + " , Good Morning ");
         System.out.print( name + ", please enter your age:");
         int age = input.nextInt();
         System.out.println("your age is: " + age);

    }
}