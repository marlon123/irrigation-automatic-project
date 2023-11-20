package service;

public class GetDataService {

    double precipitation;
    double evapotranspiration;
    double evapotranspirationReference;
    double permanentWiltingPoint;
    int rootSystemDepth;
    double fieldCapacity;
    double soilDensity;
    double availabilityCoefficient;
    double sprinklerBlade;
    int irrigationInterval;
    public double getEvapotranspiration() {
        return evapotranspiration;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public void setEvapotranspiration(double evapotranspiration) {
        this.evapotranspiration = evapotranspiration;
    }

    public double getPermanentWiltingPoint() {
        return permanentWiltingPoint;
    }

    public void setPermanentWiltingPoint(double permanentWiltingPoint) {
        this.permanentWiltingPoint = permanentWiltingPoint;
    }

    public int getRootSystemDepth() {
        return rootSystemDepth;
    }

    public void setRootSystemDepth(int rootSystemDepth) {
        this.rootSystemDepth = rootSystemDepth;
    }

    public double getEvapotranspirationReference() {
        return evapotranspirationReference;
    }

    public void setEvapotranspirationReference(double evapotranspirationReference) {
        this.evapotranspirationReference = evapotranspirationReference;
    }

    public double getFieldCapacity() {
        return fieldCapacity;
    }

    public void setFieldCapacity(double fieldCapacity) {
        this.fieldCapacity = fieldCapacity;
    }

    public double getSoilDensity() {
        return soilDensity;
    }

    public void setSoilDensity(double soilDensity) {
        this.soilDensity = soilDensity;
    }

    public double getAvailabilityCoefficient() {
        return availabilityCoefficient;
    }

    public void setAvailabilityCoefficient(double availabilityCoefficient) {
        this.availabilityCoefficient = availabilityCoefficient;
    }

    public double getSprinklerBlade() {
        return sprinklerBlade;
    }

    public void setSprinklerBlade(double sprinklerBlade) {
        this.sprinklerBlade = sprinklerBlade;
    }

    public int getIrrigationInterval() {
        return irrigationInterval;
    }

    public void setIrrigationInterval(int irrigationInterval) {
        this.irrigationInterval = irrigationInterval;
    }
}
