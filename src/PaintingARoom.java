import java.util.Scanner;
public class PaintingARoom {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int gallonCoverage = 350;
    System.out.println("What are the dimensions of your room in feet?");
    System.out.print("Length: ");
    double length = scan.nextDouble();
    System.out.print("Width: ");
    double width = scan.nextDouble();
    System.out.print("Height: ");
    double height = scan.nextDouble();
    System.out.print("Number of doors: ");
    int doors = scan.nextInt();
    System.out.print("Number of windows: ");
    int windows = scan.nextInt();

    doors*= 15;
    windows*= 10;
    double wallsOneTwo = (length*height*2);
        //square ft of two long walls combined
    double wallsThreeFour = (width*height*2);
        //square ft of two wide walls combined
    double ceiling = (length*width);
        //square ft of ceiling
    final double totalSqFt = (wallsOneTwo+wallsThreeFour+ceiling-doors-windows);
    final double gallons = totalSqFt/gallonCoverage;
    final int nearestGallon = (int) (gallons + 1);

    System.out.println(nearestGallon + " gallons of paint will be enough to paint your room.");




    }

}
