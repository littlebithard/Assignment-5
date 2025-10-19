package Decorator;
public abstract class PatientRecord implements IPatientRecord {
    protected IPatientRecord decoratedRecord;

    protected PatientRecord(IPatientRecord decoratedRecord) {
        this.decoratedRecord = decoratedRecord;
    }

    public String getDescription() {
        return decoratedRecord.getDescription();
    }

    public double getBaseCost() {
        return decoratedRecord.getBaseCost();
    }
}
