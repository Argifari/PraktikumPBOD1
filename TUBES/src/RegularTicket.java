public class RegularTicket extends Ticket {
    public static int counterRegularTicket = 0;

    public RegularTicket() {counterRegularTicket++;}
    public RegularTicket(String id, double price) {
        super(id,price);
        counterRegularTicket++;
    }

    public static int getCounterRegularTicket() {
        return counterRegularTicket;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
