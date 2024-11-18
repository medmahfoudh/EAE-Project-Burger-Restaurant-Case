public class Menu {
    private int itemId;
    private String itemName;
    private double price;
    private String description;
    private boolean availability;

    // Constructor
    public Menu(int itemId, String itemName, double price, String description, boolean availability) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    // Getter for itemId
    public int getItemId() {
        return itemId;
    }

    // Setter for itemId
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    // Getter for itemName
    public String getItemName() {
        return itemName;
    }

    // Setter for itemName
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for availability
    public boolean isAvailability() {
        return availability;
    }

    // Setter for availability
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
