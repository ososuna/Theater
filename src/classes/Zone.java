package classes;

public class Zone {
    
    private String name;
    private int availability;
    private double price;
    private double oldAgePrice;
    
    public Zone(String name, int availability, double price, double oldAgePrice) {
        this.name = name;
        this.availability = availability;
        this.price = price;
        this.oldAgePrice = oldAgePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOldAgePrice() {
        return oldAgePrice;
    }

    public void setOldAgePrice(double oldAgePrice) {
        this.oldAgePrice = oldAgePrice;
    }

    @Override
    public String toString() {
        return "Zone [availability=" + availability + ", name=" + name + ", oldAgePrice=" + oldAgePrice + ", price="
                + price + "]";
    }

}
