import java.util.Scanner;
public class Recursion{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your Number: ");
        int num = input.nextInt();
        long fact1 = factroail(num);
        long fact2= factroailNumber(num);
        System.out.println(fact1);
         System.out.print(fact2);
    }
    public static long factroail(int num){
        System.out.println("Function call for " + num);
        if(num==1){
            return 1;
        }
        return num * factroail(num-1);
    }
    public static long factroailNumber(int num){
        long result = 1;
        for(int i=1; i<=num; i++){
         result = result * i;
        }
        return result;
    }
}