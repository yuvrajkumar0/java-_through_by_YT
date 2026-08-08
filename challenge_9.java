import java.util.Scanner;
public class challenge_9{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
         
         System.out.print("please enter your number:");
         int num = input.nextInt();
         int reverse = reverse(num);
         System.out.print(num);
    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
        int digit = num % 10;
        newNum = newNum * 10 + digit;
        num/=10;
        }
       return num; 
    }
}



 
     


   