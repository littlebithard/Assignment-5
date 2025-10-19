package Decorator.Alerts;

import Decorator.IPatientRecord;
import Decorator.PatientRecord;

public class IsolationAlertDecorator extends PatientRecord {
    private String reason;

    public IsolationAlertDecorator(IPatientRecord record, String reason) {
        super(record);
        this.reason = reason;
    }

    public String getDescription() {
        return decoratedRecord.getDescription() + " | Isolation Required: " + reason;
    }

    public double getBaseCost() {
        return decoratedRecord.getBaseCost() + 8.0;
    }
}
