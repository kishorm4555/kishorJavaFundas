package kishorJavaFundas;
import java.util.Scanner;
/**
 * 
 * @author kmuthu
 *
 * version jdk11
 * since 6/6/2023
 */

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//initiating scanner
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();//taking input

        if (amount % 500 != 0) {
            System.out.println("Please enter an amount multiple of 500");//entering amount
        } else {
            System.out.println("Valid amount,transaction is in process");
            // processing the transaction
        }

        scanner.close();
    }
}
