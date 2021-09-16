import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
            // Create a Scanner object and write a prompt for the user to enter a number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a negative decimal number: ");
            // Declare a variable of the correct type that will receive the input from the user.
        double negNum = scan.nextDouble();
            // Declare a variable and write an expression to round the user input
        int nearestNegInt = (int)(negNum - 0.5);
            // ex. int roundedNum=/*expression to round a negative value*/;

            // Write a statement that will output the result in the form below.
        System.out.print(negNum + " rounded to a whole number is " + nearestNegInt );
        // ex. -3.21 rounded to a whole number is -3

    }
}
