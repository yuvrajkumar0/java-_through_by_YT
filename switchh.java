import java.util.Scanner;
public class switchh{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your Day: ");
        int day = input.nextInt();
        oldStr(day);
        newStr(day);
    }
         public static void newStr(int day){
                String str = switch(day){
                        case 1 -> "monday";
                        case 2 -> "tuesday";
                        case 3 -> "wednessday";
                        case 4 -> "thirsday";
                        case 5 -> "friday";
                        case 6 -> "saturday";
                        case 7 -> "sunday";
                        default -> "Invalid";

                };
                System.out.println(str);
         }
        public static void oldStr(int day){
         switch(day){
             case 1: 
                     System.out.print("Monday");
                    break;
             case 2: 
                     System.out.print("Tuesday");
                    break;
             case 3: 
                     System.out.print("Wednessday");
                    break;
             case 4: 
                     System.out.print("Thirsday");
                    break;
             case 5: 
                     System.out.print("Friday");
                    break;
             case 6: 
                     System.out.print("Saturday");
                    break;
             case 7: 
                     System.out.print("Sunday");
                    break;
              default:
                      System.out.println("Invalid days");
                     
        }
    }
    
    
}