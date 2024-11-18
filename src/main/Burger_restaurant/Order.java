public class Order {
    private int OrderId;
    private String OrderDate;
    private double bill;
    private String status;

    // Constructor
    public Order(int OrderId, String OrderDate, double bill, String status) {
        this.OrderId = OrderId;
        this.OrderDate = OrderDate;
        this.bill = bill;
        this.status = status;
    }

    // Getter for OrderId
    public int getOrderId() {
        return OrderId;
    }

    // Setter for OrderId
    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    // Getter for OrderDate
    public String getOrderDate() {
        return OrderDate;
    }

    // Setter for OrderDate
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    // Getter for bill
    public double getBill() {
        return bill;
    }

    // Setter for bill
    public void setBill(double bill) {
        this.bill = bill;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }
}
