import java.util.Scanner;
public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer details: ");
        String customerDetails = sc.nextLine();
        
        String[] cusDetails = customerDetails.split(":");
        
        if (cusDetails.length != 4) {
            System.out.println("Invalid input format");
            return;
        } else {
            String customerName = cusDetails[0];
            
            // Harish:2:2:2
            int numberOfAdults = Integer.parseInt(cusDetails[1]);
            if (numberOfAdults < 0) {
                System.out.println("Invalid input for number of adults");
                return;
            }
            
            int numberOfChild = Integer.parseInt(cusDetails[2]);
            if (numberOfChild < 0) {
                System.out.println("Invalid input for number of children");
                return;
            }
            
            int numberOfDays = Integer.parseInt(cusDetails[3]);
            if (numberOfDays <= 0) {
                System.out.println("Invalid input for number of days");
            } else {
                int PerAdultPrice = 1000;
                int PerChildPrice = 650;
                
                int totalPrice = ((numberOfAdults * PerAdultPrice) + (numberOfChild * PerChildPrice)) * numberOfDays;
                System.out.println(customerName + " your booking is confirmed and the total cost is " + totalPrice);
            }
        }
    }
}
