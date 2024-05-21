public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketId) {
        this.ticketid = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Ticket.availableTickets = availableTickets;
        }
    }

    public int calculateTicketCost(int nooftickets) {
        if (nooftickets <= availableTickets) {
            availableTickets -= nooftickets;
            return nooftickets * price;
        } else {
            return -1;
        }
    }
}