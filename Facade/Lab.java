package Facade;

public class Lab {
    class LabService {
        public void orderLabTest(String patientName, String testName) {
            System.out.println("Lab test ordered for " + patientName + ": " + testName);
        }
    }

    class BillingSystem {
        public void createInvoice(String patientName, double amount) {
            System.out.println("Invoice created for " + patientName + " | Amount: $" + amount);
        }
    }

    class AppointmentSystem {
        public void scheduleAppointment(String patientName, String date) {
            System.out.println("Appointment scheduled for " + patientName + " on " + date);
        }
    }
}
