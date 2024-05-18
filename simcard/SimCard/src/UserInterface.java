import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int oddsum = 0, evensum = 0;
        System.out.println("Enter the phone number");
        long n = sc.nextLong();

        while (n > 0) {
            int digit = (int)(n % 10);
            if (digit % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
            n /= 10;
        }

        if (oddsum == evensum) {
            System.out.println("Sum of odd and even are equal");
        } else if (evensum > oddsum) {
            System.out.println("Sum of even is greater than sum of odd.");
        } else {
            System.out.println("Sum of odd is greater than sum of even");
        }
    }
}