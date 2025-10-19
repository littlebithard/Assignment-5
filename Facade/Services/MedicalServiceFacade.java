package Facade.Services;

import Facade.Systems.AppointmentSystem;
import Facade.Systems.BillingSystem;

public class MedicalServiceFacade {
    private LabService labService;
    private BillingSystem billingSystem;
    private AppointmentSystem appointmentSystem;

    public MedicalServiceFacade() {
        this.labService = new LabService();
        this.billingSystem = new BillingSystem();
        this.appointmentSystem = new AppointmentSystem();
    }

    public void performFullCheckup(String patientName) {
        System.out.println("\n--- Starting Full Checkup for " + patientName + " ---");
        labService.orderLabTest(patientName, "Blood Test");
        appointmentSystem.scheduleAppointment(patientName, "2015-01-13");
        billingSystem.createInvoice(patientName, 250.00);
        System.out.println("--- Checkup Completed ---\n");
    }

    public void orderLabOnly(String patientName, String testName) {
        System.out.println("\n--- Lab Service ---");
        labService.orderLabTest(patientName, testName);
        billingSystem.createInvoice(patientName, 80.00);
    }
}
