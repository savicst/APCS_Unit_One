import java.math.BigInteger;
import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a five digit number:");
        int fiveDig = scan.nextInt();
        int firstDig = (fiveDig / 10000);
        int fDmod = (fiveDig % 10000);
        int secondDig = (fDmod / 1000);
        int sDmod = (fDmod % 1000);
        int thirdDig = (sDmod / 100);
        int tDmod = (sDmod % 100);
        int fourthDig = (tDmod / 10);
        int fifthDig = (tDmod % 10);
        System.out.println(firstDig+" "+secondDig+" "+thirdDig+" "+ fourthDig+" "+fifthDig );


    }
}
