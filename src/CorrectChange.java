import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents:");
        int cents = scan.nextInt();
        int dollars = (cents / 100);
        int dollarMod = (cents % 100);
        int quarters = (dollarMod / 25);
        int quarterMod = (dollarMod % 25);
        int dimes = (quarterMod / 10);
        int dimeMod = (quarterMod % 10);
        int nickels = (dimeMod / 5);
        int pennies = (dimeMod % 5);
        System.out.println("You have " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");

    }
}
