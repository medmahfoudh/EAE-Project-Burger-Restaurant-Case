public class Customer {
    private int customerId;
    private String customerName;
    private int phone;

    // Constructor
    public Customer(int customerId, String customerName, int phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phone = phone;
    }

    // Getter for customerId
    public int getCustomerId() {
        return customerId;
    }

    // Setter for customerId
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Setter for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for phone
    public int getPhone() {
        return phone;
    }

    // Setter for phone
    public void setPhone(int phone) {
        this.phone = phone;
    }
}
