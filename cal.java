import java.util.Scanner;
public class cal{
    public static void main(String [] args){
        System.out.println("Welcom To Our Calculator: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The First Number:");
        int a = sc.nextInt();
         System.out.println("Please Enter The Second Number:");
        int b = sc.nextInt();
        try{

        
        int result = a/b;
        System.out.println();
        }catch (Throwable ex){
             System.out.println("Please Enter the Valid Value");

        }



        
    

    }
}