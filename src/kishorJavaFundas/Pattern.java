package kishorJavaFundas;
import java.util.*;

/**
 * 
 * @author kmuthu
 *
 * version jdk11
 * since 6/6/2023
 */

public class Pattern {
	

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the Number of lines: ");
	        int lines = scanner.nextInt();

	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	
		
		
	    }

		
		

	


