package classes;

public class Ticket {
    
    private int id;
    private String zone;
    private String buyerName;
    private double cost;
    
    public Ticket(int id, String zone, String buyerName, double cost) {
        this.id = id;
        this.zone = zone;
        this.buyerName = buyerName;
        this.cost = cost;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ticket [buyerName=" + buyerName + ", cost=" + cost + ", id=" + id + ", zone=" + zone + "]";
    }

}
