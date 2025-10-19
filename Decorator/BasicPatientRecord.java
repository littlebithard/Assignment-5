package Decorator;

public class BasicPatientRecord implements IPatientRecord {
    private String patientName;
    private String diagnosis;

    public BasicPatientRecord(String patientName, String diagnosis) {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
    }

    public String getDescription() {
        return "Record for " + patientName + " | Diagnosis: " + diagnosis;
    }

    public double getBaseCost() {
        return 100.0;
    }
}
