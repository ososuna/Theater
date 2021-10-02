package classes;

public class Ticket {
    
    private int id;
    private String zone;
    private String buyerName;
    
    public Ticket(int id, String zone, String buyerName) {
        this.id = id;
        this.zone = zone;
        this.buyerName = buyerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public String toString() {
        return "Ticket [buyerName=" + buyerName + ", id=" + id + ", zone=" + zone + "]";
    }

}
