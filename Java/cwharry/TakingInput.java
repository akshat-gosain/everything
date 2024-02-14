import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a+b;
        float sum = a + b;
        System.out.printf("The sum of these numbers is: %.2f\n", sum);

        // Flush the input buffer
        System.out.flush();
    
        //Scanning string
        System.out.println("Enter a string: ");
        String str = sc.next(); //takes entire sentences despite of spaces in between
        System.out.println("The user entered this: ");
        System.out.println(str);

        sc.close(); // Close the Scanner object at the end of the program
    }
}