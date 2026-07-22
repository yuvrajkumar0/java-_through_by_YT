
import java.util.Scanner;
public class challenge_5{
    public static void main(String[] args){
        int arr[] = {11,12,13,14,15,16,17,19,20};
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your find number: ");
        int num = input.nextInt();
         boolean isFound = isFound(arr, num);
        if(isFound){
             System.out.print("your number is found");
        }else{
             System.out.print("your number is not found");
        }
     // function start
      }
    public static boolean isFound(int arr[], int num){
     int index = 0;
     while(index< arr.length){
        if(arr[index] == num){
        return true;
        }
         index++;
     }
     return false;
    }
     
}