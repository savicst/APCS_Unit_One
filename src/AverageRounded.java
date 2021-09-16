import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter three positive decimal numbers:");
    double average = scan.nextDouble();
    average+= scan.nextDouble();
    average+=scan.nextDouble();
    average = (int)(average/3 +.05);
    int averageInt = average;
    System.out.println("Average: "+ average);
    }
}
