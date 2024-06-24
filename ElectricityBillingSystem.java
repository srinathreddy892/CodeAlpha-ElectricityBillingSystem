import java.util.Scanner;

// Define a class for the customer
class Customer {
    private String name;
    private int unitsConsumed;

    // Constructor
    public Customer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    // Method to calculate the bill amount
    public double calculateBill() {
        double billAmount = 0;
        // Assuming Rs. 5 per unit for simplicity
        billAmount = unitsConsumed * 5.0;
        return billAmount;
    }

    // Method to display the bill
    public void displayBill() {
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + calculateBill());
    }
}

// Main class for the Electricity Billing System
public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Create a customer object
        Customer customer = new Customer(name, unitsConsumed);

        // Display the bill
        System.out.println("\n--- Electricity Bill ---");
        customer.displayBill();

        scanner.close();
    }
}
