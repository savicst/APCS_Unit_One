import java.util.Scanner;

public class FindTheAverage {

    public static void main(String[] args) {

            // Create a Scanner object to get user input
        Scanner scan = new Scanner(System.in);
            // Create a total variable to keep track of the total value
        double total;
            // Get four pieces of user input
        System.out.println("Enter four values.");
        System.out.print("Value 1: ");
        double val1 = scan.nextDouble();
        total = val1;
        System.out.print("Value 2: ");
        double val2 = scan.nextDouble();
        total += val2;
        System.out.print("Value 3: ");
        double val3 = scan.nextDouble();
        total += val3;
        System.out.print("Value 4: ");
        double val4 = scan.nextDouble();
        total += val4;
            // Calculate the average
        total /= 4;
            // Display the result
        System.out.println("Average = " + total);


    }

}
