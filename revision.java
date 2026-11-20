/*import java.util.Scanner;

public class revision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean prime = true;

        if (n <= 1) {
            prime = false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
    
   public class revision {

    public static void main(String[] args) {

        int[] arr = {10, 25, 8, 45, 32};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
    */

public class revision{

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int index = 0;

        // Non-zero elements ko aage laao
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Remaining positions mein 0 daalo
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}