import java.util.Scanner;
public class  simpleCal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Please Enter your First value:");
            int val1 = input.nextInt();
            System.out.print(" Please Enter your Second value:");
            int val2 = input.nextInt();
        System.out.println("for Addition press 1:");
         System.out.println("for subtraction press 2:");
          System.out.println("for multiply press 3:");
           System.out.println("for divide press 4:");
             System.out.println("Please Enter Your Choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1 -> System.out.print("Addition is= " +(val1+val2));
                case 2 -> System.out.print("subraction is=" +(val1 - val2));
                case 3 -> System.out.print("multiplication=" +(val1*val2));
                case 4 -> {
                    if(val2 !=0){
                        System.out.print("Division ="+ (val1 / val2));
                    }else{
                        System.out.print("cannot Divided by zero: ");
                    }
                }
                default  -> System.out.println("invalid choice: ");
            }
    }
}
