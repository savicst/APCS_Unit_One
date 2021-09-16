import java.util.Scanner;
public class AddOneTakeOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int numMinus= --num;
        int numPlus = ++num;
        numPlus++;

        System.out.print(numMinus + " " + num + " " + numPlus);
    }
}
