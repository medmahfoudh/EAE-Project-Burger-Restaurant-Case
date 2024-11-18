public class Employee {
    private int EmployeeId;
    private String name;
    private String position;

    // Constructor
    public Employee(int EmployeeId, String name, String position) {
        this.EmployeeId = EmployeeId;
        this.name = name;
        this.position = position;
    }

    // Getter for EmployeeId
    public int getEmployeeId() {
        return EmployeeId;
    }

    // Setter for EmployeeId
    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for position
    public String getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(String position) {
        this.position = position;
    }
}
