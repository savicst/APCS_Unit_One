public class TotalWithTax {

    public static void main(String[] args)
    {
        final double TAXRATE = 0.0825;
        double price = 52.75;
        double tax = (price * TAXRATE);
        double total = (price + tax);
        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + tax);
        System.out.println("Total: $" + total);

        //Declare the variables and the constant.
        //Make the calculations and assign
        //the results to the appropriate variables.
        //Print the results.
    }
}
