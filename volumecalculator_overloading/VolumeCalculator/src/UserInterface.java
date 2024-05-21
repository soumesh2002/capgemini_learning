import java.util.Scanner;

public class UserInterface {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        int choice = sc.nextInt();

        VolumeCalculator V1 = new VolumeCalculator();

        if (choice == 1) {
            System.out.println("Enter the radius");
            double radius = sc.nextDouble();
            
            System.out.println("Enter the height");
            double height = sc.nextDouble();

            System.out.printf("Volume of the Cylinder is %.2f", V1.calculateVolume(radius, height));
        
        } else {
            System.out.println("Enter the length");
            int length = sc.nextInt();

            System.out.println("Enter the breadth");
            int breadth = sc.nextInt();

            System.out.println("Enter the height");
            int height = sc.nextInt();

            System.out.printf("Volume of the Cuboid is %.2f", V1.calculateVolume(length, breadth, height));
        }
    }
}
