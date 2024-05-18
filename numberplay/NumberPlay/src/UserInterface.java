import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev = 0;

        if (num < 10 || num > 99) {
            System.out.println("Invalid number");
        } else if (num < 50 || num > 50) {
            int FD = num / 10;
            int SD = num % 10;
            System.out.println(FD - SD);
        } else {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;

            int RFD = rev / 10;
            int SFD = rev % 10;
            System.out.println(RFD - SFD);
        }
    }
}