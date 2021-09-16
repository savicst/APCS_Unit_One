import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter three positive decimal numbers:");
    double average = scan.nextDouble();
    average+= scan.nextDouble();
    average+=scan.nextDouble();
    average /= 3;
    int averageInt = (int) (average+ .5);
    System.out.println("Average = "+ averageInt);
    }
}
