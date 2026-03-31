public class VIPTicket extends Ticket{
    private static int counterVipTicket = 0;

    public VIPTicket() {
        counterVipTicket++;
    }
    public VIPTicket(String ticketId, double price) {
        super(ticketId,price);
        counterVipTicket++;
    }
    public static int getCounterVipTicket() {
        return counterVipTicket;
    }
    
    @Override
    public double getPrice() {
        return basePrice + (basePrice*0.20);
    }
}
