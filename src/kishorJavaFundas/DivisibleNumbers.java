package kishorJavaFundas;
import java.util.*;

/**
 * 
 * @author kmuthu
 *
 * version jdk11
 * since 6/6/2023
 */

public class DivisibleNumbers {

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);

		        System.out.print("Enter n value: ");//taking input
		        int n = scan.nextInt();

		        int[] array = new int[n];
		        System.out.print("Enter the elements: ");
		        for (int i = 0; i < n; i++) {
		            array[i] = scan.nextInt();//taking input for each element for the array
		        }

		    
		        for (int i = 0; i < n; i++) {
		            if (array[i] % 3 == 0 || array[i] % 7 == 0) {//checking if it is divisible by 3 or 7
		                System.out.print(array[i] + " ");
		            }
		        }

		        scan.close();
		    }
		
	}
