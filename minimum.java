// create a program to find the minimum of two number:
import java.util.Scanner;
public class minimum{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("please enter your 1st number: ");
        int a = input.nextInt();

        System.out.print("please enter your 2nd number: ");
        int b = input.nextInt();

       minimum ternary = new minimum();
        int min = ternary.min(a,b);
        System.out.print("Minimum Number is: " +min);

    }
    public int min(int a, int b){
        return a<b? a : b;

    }
        
}
