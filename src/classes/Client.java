package classes;

public class Client {
    
    private String name;
    private String discount;
    private Ticket ticket;
    
    public Client(String name, String discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDiscount() {
        return discount;
    }
    
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    
    public Ticket getTicket() {
        return ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    @Override
    public String toString() {
        return "Client [discount=" + discount + ", name=" + name + ", ticket=" + ticket + "]";
    }

}
