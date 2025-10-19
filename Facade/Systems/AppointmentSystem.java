package Facade.Systems;

public class AppointmentSystem {
    public void scheduleAppointment(String patientName, String date) {
        System.out.println("Appointment scheduled for " + patientName + " on " + date);
    }
}
