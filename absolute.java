import java.util.Scanner;
public class absolute{
    
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        System.out.print("please enter your value: ");
        int val = input.nextInt();
        if(val>0){
             System.out.print(val);
        }else{
             System.out.print(-val);
        }
        
    }
}