public abstract class Ticket {
    protected String ticketId;
    protected double basePrice;


    public Ticket(){}
    public Ticket(String ticketId, double basePrice) {
        assert basePrice > 0 : "Harga ticket harus lebih dari 0";
        this.ticketId = ticketId;
        this.basePrice = basePrice;
    }

    public String getTicketId() {
        return ticketId;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double getPrice();
}
