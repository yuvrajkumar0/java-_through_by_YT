 import java.util.Scanner;
    public class challenge_7{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
       int arry [] =new int[5];
       for(int i=0; i<5; i++){
       System.out.print("please enter your element: ");
        int num = input.nextInt();
       arry[i] = num;
       }
          System.out.print("please enter your finding element: ");
          int find = input.nextInt();
          boolean isFound = isFound(arry,find);
          if(isFound){
             System.out.print("this element was in arry: ");
          }else{
             System.out.print("this element was not in arry: ");
          }
      }
      public static boolean isFound(int arry[], int find){
        int i=0;
        while(i<5){
            if(arry[i] == find){
            return true;
            }
            i++;
        }
      return false;
      }
    }
