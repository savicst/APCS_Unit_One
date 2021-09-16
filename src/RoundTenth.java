import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Prompt the user for a positive decimal number
        System.out.print("Decimal number?");
        double decimal = scan.nextDouble();
        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/
        double rounded = (decimal + .05) * 10;
        rounded = (int)(rounded);
        rounded /=10;

        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5
        System.out.print(decimal + " rounded to the nearest tenth is " + rounded);


    }
}
