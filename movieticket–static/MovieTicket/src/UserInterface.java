import java.util.Scanner;

public class UserInterface {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name");
        String movieName = sc.nextLine();
        // sc.nextLine();

        System.out.println("Enter no of bookings");
        int n = sc.nextInt();

        System.out.println("Enter the available tickets");
        int AT = sc.nextInt();
        Ticket.setAvailableTickets(AT);

        for (int i = 0; i <= n; i++) {
            System.out.println("Enter the ticketid");
            int tid = sc.nextInt();

            System.out.println("Enter the price");
            int price = sc.nextInt();

            System.out.println("Enter the no of tickets");
            int nooftickets = sc.nextInt();

            Ticket T1 = new Ticket();
            T1.setTicketid(tid);
            T1.setPrice(price);

            System.out.println("Available tickets: " + Ticket.getAvailableTickets());
            int totalAmount = T1.calculateTicketCost(nooftickets);

            if (totalAmount == -1) {
                System.out.println("Tickets are not available");
                break;
            } else {
                System.out.println("Total amount: " + totalAmount);
                if (Ticket.getAvailableTickets() == 0) {
                    System.out.println("Housefull");
                    return;
                }
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            }
        }
        sc.close();
    }
}
