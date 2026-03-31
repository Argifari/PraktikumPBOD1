import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Ticket> items = new ArrayList<>();

    public Order() {
    }
    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public void addTicket(Ticket t) {
        items.add(t);
        System.out.println("Tiket " + t.ticketId + " ditambahkan");
    }
    
    public void addTicket(Ticket t, int qty) {
        for (int i = 0; i < qty;i++) {
            items.add(t);
        }
        System.out.println(qty +" Tiket " + t.ticketId + " ditambahkan");

    }

    public double getTotal() {
        double total = 0;
        for (Ticket t : items) total += t.getPrice();
        return total;
    }
    
}
