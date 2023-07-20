package kishorJavaFundas;

import java.util.Scanner;

/**
 * 
 * @author kmuthu
 *
 * version jdk11
 * since 6/6/2023
 */

public class BloodDonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age and weight of the person: ");
        int age = scanner.nextInt();//taking input as age
        int weight = scanner.nextInt();//taking input as weight

        if (isEligibleDonor(age, weight)) {
            System.out.println("Eligible Donor!!");
        } else {
            System.out.println("Not Eligible Donor!!");
        }

        scanner.close();
    }

    public static boolean isEligibleDonor(int age, int weight) {
        if (age > 18 && age <= 55 && weight > 45) {//returns true if age is greater than 18 and lesser than or equal to 55 and weight is greater than 45 
            return true;
        }
        return false;
    }
}

