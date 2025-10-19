package Decorator.Alerts;

import Decorator.IPatientRecord;
import Decorator.PatientRecord;

public class FallRiskDecorator extends PatientRecord {
    public FallRiskDecorator(IPatientRecord record) {
        super(record);
    }

    public String getDescription() {
        return decoratedRecord.getDescription() + " | Fall Risk Flag Enabled";
    }

    public double getBaseCost() {
        return decoratedRecord.getBaseCost() + 5.0;
    }
}