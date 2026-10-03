import java.util.Scanner;
public class score{
    
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        System.out.print("please enter  the month: ");
        int month = input.nextInt();
        switch(month){
            case 1 -> System.out.print("january");
            case 2 -> System.out.print("february");
            case 3 ->  System.out.print("march");
            case 4 ->  System.out.print("april");
            case 5 ->  System.out.print("may");
            case 6 ->  System.out.print("june");
            case 7 -> System.out.print(" july");
            case 8 -> System.out.print("aguest");
            case 9 -> System.out.print("setember");
            case 10 -> System.out.print("octorber");
            case 11 ->  System.out.print("november");
           case 12 ->  System.out.print(" December");
           default ->  System.out.print("Invalid");
        }
    }
}
