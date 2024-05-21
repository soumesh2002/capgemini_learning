import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            if (name.equals("Yes")) {
                System.out.println("number is divisble by 5");
                break;
            } else {
                System.out.println("number is not divisible by 5");
            }
        }
    }
}
