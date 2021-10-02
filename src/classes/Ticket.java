package classes;

import java.text.DecimalFormat;

public class Ticket {
    
    private int id;
    private String zone;
    private String buyerName;
    private String discountType;
    private double cost;

    public Ticket(int id, String zone, String buyerName, String discountType, double cost) {
        this.id = id;
        this.zone = zone;
        this.buyerName = buyerName;
        this.discountType = discountType;
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

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        
        DecimalFormat df4 = new DecimalFormat("#.##");

        return "\nId: " + id + "\nName: " + buyerName + "\nZone: " +
                zone + "\nDiscount: " + discountType + "\nCost: " +
                "$" + df4.format(cost);
    }

}
