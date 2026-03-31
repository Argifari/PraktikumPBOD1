import java.util.List;

public class Admin extends User {
    private String employeeId;
    private static int counterAdmin = 0;


    public Admin() {
        counterAdmin++;
    }
    public Admin(String username, String email, String employeeId) {
        super(username,email);
        this.employeeId = employeeId;
        counterAdmin++;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public static int gerCounterAdmin() {
        return counterAdmin;
    }

    @Override
    public void printInfo() {

        System.out.println("ADMIN INFO : ");
        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Employee Id : " + employeeId);
    }
    
    public void updateTicketPrice(Ticket t, double newPrice) {
        assert newPrice > 0: "Admin dilarang memasukkan harga negatif";
        
        t.basePrice = newPrice;
        System.out.println("Admin " + username + " memperbarui harga ticket " + t.ticketId + 
        " menjadi: " + newPrice);
        
    }
    public void removeTicket(List<Ticket> list, Ticket t) {
        list.remove(t);
        System.out.println("Ticket dihapus dari sistem");
        
    }
    public void removeTicket(List<Ticket> list, String ticketId) {
        list.removeIf(t -> t.ticketId.equals(ticketId));
        System.out.println("Ticket dengan id " + ticketId + " dihapus dari sistem");
        
    }
}
