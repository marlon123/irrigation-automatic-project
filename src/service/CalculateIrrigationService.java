package service;

public class CalculateIrrigationService {
    GetDataService getDataService = new GetDataService();
    double cropCoefficient = 0;
    double availableWaterCapacity = 0;
    double waterReadilyAvailableFinal = -1;

    public double getWaterReadilyAvailableFinal() {
        return waterReadilyAvailableFinal;
    }

    public void setWaterReadilyAvailableFinal(double waterReadilyAvailableFinal) {
        this.waterReadilyAvailableFinal = waterReadilyAvailableFinal;
    }

    public double getWaterReadilyAvailableInitially() {
        return waterReadilyAvailableInitially;
    }
    public double getWaterReadilyAvailableInitially(GetDataService getDataService) {
        calculateAFDi(getDataService);
        return waterReadilyAvailableInitially;
    }

    public void setWaterReadilyAvailableInitially(double waterReadilyAvailableInitially) {
        this.waterReadilyAvailableInitially = waterReadilyAvailableInitially;
    }

    double waterReadilyAvailableInitially = waterReadilyAvailableFinal;
    public GetDataService getGetDataService() {
        return getDataService;
    }

    public void setGetDataService(GetDataService getDataService) {
        this.getDataService = getDataService;
    }

    public double getAvailableWaterCapacity() {
        return availableWaterCapacity;
    }
    public double getAvailableWaterCapacity(GetDataService getDataService) {
        calculateCAD(getDataService);
        return availableWaterCapacity;
    }

    public void setAvailableWaterCapacity(double availableWaterCapacity) {
        this.availableWaterCapacity = availableWaterCapacity;
    }

    public double getCropCoefficient() {
        return cropCoefficient;
    }

    public double getCropCoefficient(GetDataService getDataService) {
        calculateKC(getDataService);
        return cropCoefficient;
    }

    public void setCropCoefficient(double cropCoefficient) {
        this.cropCoefficient = cropCoefficient;
    }

    private void calculateKC(GetDataService getDataService){
        setCropCoefficient(getDataService.evapotranspiration / getDataService.evapotranspirationReference);
    }

    private void calculateCAD(GetDataService getDataService){
        setAvailableWaterCapacity(getCropCoefficient() * getDataService.evapotranspiration);
    }

    private void calculateAFDi(GetDataService getDataService){
        if (waterReadilyAvailableFinal == -1.0){
            setWaterReadilyAvailableInitially(getAvailableWaterCapacity(getDataService) * getDataService.getAvailabilityCoefficient());
        }else {
            setWaterReadilyAvailableInitially(getWaterReadilyAvailableFinal());
        }
    }

}
