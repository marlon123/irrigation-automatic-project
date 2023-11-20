import service.CalculateIrrigationService;
import service.GetDataService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetDataService getDataService = new GetDataService();
        CalculateIrrigationService calculateIrrigationService = new CalculateIrrigationService();

        System.out.println("Hello world!");

        System.out.println("Valor da evapotranspiracao de cultivo: ");
        double evapotranspiration = sc.nextDouble();
        getDataService.setEvapotranspiration(evapotranspiration);

        System.out.println("Valor da evapotranspiracao de Referencia: ");
        double evapotranspirationReference = sc.nextDouble();
        getDataService.setEvapotranspirationReference(evapotranspirationReference);

        System.out.println("Fator de disponibilidade: ");
        double availabilityCoefficient = sc.nextDouble();
        getDataService.setAvailabilityCoefficient(availabilityCoefficient);

        System.out.println("ETc = " + evapotranspiration + "\nETo = " + evapotranspirationReference);

        System.out.println("\nCoeficiente de cultura (KC): " + calculateIrrigationService.getCropCoefficient(getDataService));
        System.out.println("\nCapacidade de água disponível no solo (CAD): " + calculateIrrigationService.getAvailableWaterCapacity(getDataService));
        System.out.println("\nÁgua facilmente disponível inicial (AFDi): " + calculateIrrigationService.getWaterReadilyAvailableInitially(getDataService));
    }
}