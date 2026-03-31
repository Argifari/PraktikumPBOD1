import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private List<Ticket> availableTickets = new ArrayList<>();
    public static int counterEvent = 0;


    public Event(){
        counterEvent++;
    }
    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public List<Ticket> getAvailableTickets() {
        return availableTickets;
    }

    public void addTicketToEvent(Ticket t) {
        availableTickets.add(t);
    }

}
