package Decorator;

import Decorator.Alerts.AllergyAlertDecorator;
import Decorator.Alerts.FallRiskDecorator;
import Decorator.Alerts.IsolationAlertDecorator;

public class Decorator {
    public static void main(String[] args) {
        IPatientRecord record = new BasicPatientRecord("Alice Smith", "Asthma");

        record = new AllergyAlertDecorator(record, "Peanuts");
        record = new FallRiskDecorator(record);
        record = new IsolationAlertDecorator(record, "Airborne Infection");

        System.out.println(record.getDescription());
        System.out.println("Total Handling Cost: $" + record.getBaseCost());
    }
}
