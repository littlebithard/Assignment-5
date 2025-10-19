package Facade.Systems;

public class BillingSystem {
    public void createInvoice(String patientName, double amount) {
        System.out.println("Invoice created for " + patientName + " | Amount: " + amount);
    }
}
