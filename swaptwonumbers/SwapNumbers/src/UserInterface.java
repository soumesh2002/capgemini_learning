import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int first, second;

		first = sc.nextInt();
		second = sc.nextInt();

		System.out.println("Before swapping");
		System.out.println("first = " + first + ", second = " + second);

		first = first ^ second;
		second = first ^ second;
		first = first ^ second;

		System.out.println("After swapping");
		System.out.println("first = " + first + ", second = " + second);
	}

}
