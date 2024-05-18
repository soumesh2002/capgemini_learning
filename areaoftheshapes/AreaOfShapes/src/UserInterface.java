import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides");
		int sides = sc.nextInt();

		if (sides == 0) {
			System.out.println("Enter the raidus");
			double r = sc.nextDouble();
			double circleArea = 3.14 * (r * r);
			System.out.printf("Area of the Circle is %.2f", circleArea);
		}

		else if (sides == 3) {
			System.out.println("Enter the base and height");
			double b = sc.nextDouble();
			double h = sc.nextDouble();
			double triangleArea = (b * h) / 2;
			System.out.printf("Area of the Triangle is %.2f", triangleArea);
		}

		else if (sides == 4) {
			System.out.println("Enter the length");
			double L = sc.nextDouble();
			System.out.println("Enter the breadth");
			double B = sc.nextDouble();

			double area = L * B;

			if (L == B) {
				System.out.printf("Area of the Square is %.2f", area);
			} else {
				System.out.printf("Area of the Rectangle is %.2f", area);
			}
		} else {
			System.out.println("Invalid side");
		}
	}
}
