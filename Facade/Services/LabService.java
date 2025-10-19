package Facade.Services;

public class LabService {
    public void orderLabTest(String patientName, String testName) {
        System.out.println("Lab test ordered for " + patientName + ": " + testName);
    }
}
