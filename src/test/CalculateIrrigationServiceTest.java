package test;

import org.junit.Assert;
import org.junit.Test;
import service.CalculateIrrigationService;
import service.GetDataService;

public class CalculateIrrigationServiceTest {

    private final CalculateIrrigationService calculateIrrigationService;
    private final GetDataService getDataService;

    public CalculateIrrigationServiceTest() {
        calculateIrrigationService = new CalculateIrrigationService();
        getDataService = new GetDataService();
    }
    @Test
    public void calculateKcTest(){
        getDataService.setEvapotranspiration(0.5);
        getDataService.setEvapotranspirationReference(2.0);

        double kC = calculateIrrigationService.getCropCoefficient(getDataService);

        Assert.assertEquals(kC, 0.25, 0.01);
    }

}

