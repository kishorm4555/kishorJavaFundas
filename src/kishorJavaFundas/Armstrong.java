package kishorJavaFundas;
import java.util.*;
/**
 * 
 * @author kmuthu
 *
 * version jdk11
 * since 6/6/2023
 */

public class Armstrong {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the Number: ");//taking input
	        int number = scan.nextInt();

	        if (number < 100 || number > 999) {
	            System.out.println(number + " is not a valid number");
	        } else {
	            int d1 = number % 10;
	            int d2 = (number / 10) % 10;
	            int d3 = (number / 100) % 10;

	            int sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

	            if (sum == number) {
	                System.out.println("Lucky Armstrong Number!!");
	            } else {
	                System.out.println("Sorry, it's not a lucky Armstrong number");
	            }
	        

	        scan.close();
	    
	}
		// TODO Auto-generated method stub

	}

}
