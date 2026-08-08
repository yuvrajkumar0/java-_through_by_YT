import java.util.Scanner;
public class oddEvenTernery{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
         System.out.print("please enter your Number:  ");
        int num = input.nextInt();

        String check = check(num);
        System.out.print(check);

        

    }
    public static String check(int num){
       return  num %2 == 0? "even" :"odd";

    }
}