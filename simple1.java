import java.util.Scanner;
public class simple1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Please Enter the first Number:");
        int  a =  input.nextInt();  

        if(a>20){
            System.out.printf("the number is %d",a);
        }
        else if(a<20){
            while(a<20){
                System.out.print("Please Enter the Number:");
          a =  input.nextInt();
            }
        }
        System.out.printf("the number which is greater than 20 is %d",a);

    
    }
}