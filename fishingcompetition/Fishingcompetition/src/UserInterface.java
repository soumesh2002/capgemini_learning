import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the details");
		String info = sc.nextLine();
		
		String[] details = info.split(":");
		
		if (details.length < 5) {
		    System.out.println(info + " is an invalid input");
		}
		
		String pName = details[0];
		int pAge = Integer.parseInt(details[1]);
		int bigFishCount = Integer.parseInt(details[2]);
		int mediumFishCount = Integer.parseInt(details[3]);
		int smallFishCount = Integer.parseInt(details[4]);
		
		if (pAge < 18) {
		    System.out.println(pAge + " is an invalid age");
		    return;
		}
		
		if (bigFishCount < 0 ) {
		    System.out.println(bigFishCount + " is an invalid input");
		    return;
		}
		
		if (mediumFishCount < 0 ) {
		    System.out.println(mediumFishCount + " is an invalid input");
		    return;
		}
		
		if (smallFishCount < 0 ) {
		    System.out.println(smallFishCount + " is an invalid input");
		    return;
		}
		
		int bigScore = 10;
		int medScore = 6;
		int smallScore = 3;
		int totalPoints = (bigScore * bigFishCount) + (medScore * mediumFishCount) + (smallScore * smallFishCount); 
		
		System.out.println(pName + " scored " + totalPoints + " points");
	}
}	
