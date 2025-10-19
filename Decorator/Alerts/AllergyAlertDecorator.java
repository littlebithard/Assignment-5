package Decorator.Alerts;

import Decorator.IPatientRecord;
import Decorator.PatientRecord;

public class AllergyAlertDecorator extends PatientRecord{
    private String allergy;

    public AllergyAlertDecorator(IPatientRecord record, String allergy) {
        super(record);
        this.allergy = allergy;
    }

    @Override
    public String getDescription() {
        return decoratedRecord.getDescription() + " | Allergy Alert: " + allergy;
    }

    @Override
    public double getBaseCost() {
        return decoratedRecord.getBaseCost() + 10.0;
    }
}
