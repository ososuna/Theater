package classes;

import java.util.ArrayList;

public class Tickets {
    
    public ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    public int getNextId() {
        
        if (tickets.isEmpty()) {
            return 1;
        }

        return tickets.get(tickets.size()-1).getId() + 1;

    }

}
