import java.util.Scanner;
public class Recursion{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your Number: ");
        int num = input.nextInt();
        long fact = factroailNumber(num);
        System.out.print(fact);
    }
    public static long factroailNumber(int num){
        long result = 1;
        for(int i=1; i<num; i++){
         result = result * i;
        }
        return result;
    }
}