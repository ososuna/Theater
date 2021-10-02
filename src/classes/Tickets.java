package classes;

import java.util.ArrayList;

public class Tickets {
    
    public static ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    public static int getNextId() {
        
        if (tickets.isEmpty()) {
            return 1;
        }

        return tickets.get(tickets.size()-1).getId() + 1;

    }

}
