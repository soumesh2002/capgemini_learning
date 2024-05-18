import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double length, breadth, area;

        System.out.println("Enter the length of the room(in m)");
        length = sc.nextDouble();

        if (length <= 0) {
            System.out.println("Invalid length");
            return;
        }

        System.out.println("Enter the breadth of the room(in m)");
        breadth = sc.nextDouble();

        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            return;
        }

        System.out.println("Enter the plant area of a single plant(in cm2)");
        area = sc.nextDouble();

        if (area <= 0) {
            System.out.println("Invalid plant area");
            return;
        }

        double ra = length * breadth;
        int tp = (int)((ra/(area/(10000))) / 10) * 10;
        double op = tp * 0.9;

        System.out.println("Total number of plants is " + tp);
        System.out.printf("Total oxygen production is %.2f litres", op);
    }

}
