// Main 
public class Main{
  public static void main(String[] args) {
      //Create Employees 
      Employee employee1 = new Employee(2, "Michael", "Kitchen Staff");

      // Display Test
    System.out.println("Employee 1: ");
    System.out.println("Name:" + employee1.getName() + " \n" 
                      +  "position: " + employee1.getPosition());
  }
}