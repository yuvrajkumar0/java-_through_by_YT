	import java.util.Scanner;
	public class simple{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter your age: ");
	int age = input.nextInt();
	if(age>18){
	System.out.print("you are eligible for voting..");
	}
	  else
	  {
	  System.out.print("you are not eligible for voting..");
	  }
	
   }
}
