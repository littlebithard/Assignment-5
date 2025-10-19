
package Facade;

import Facade.Services.MedicalServiceFacade;

public class Facade {
    public static void main(String[] args) {
        MedicalServiceFacade facade = new MedicalServiceFacade();

        facade.performFullCheckup("Anybody");
        facade.orderLabOnly("Somebody", "COVID-19 Test");
    }
}
