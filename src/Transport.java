public abstract class Transport {

    private String model;
    private String brand;
    private Double engineVolume;


    public Transport(String model, String brand, Double engineVolume) {

        if (model == null || model.isEmpty()) {
            this.model = "defauilt";
        } else {
            this.model = model;
        }

        if (brand == null || brand.isEmpty()) {
            this.brand = "defauilt";
        } else {
            this.brand = brand;
        }

        if (engineVolume != null) {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void finishTheMoving();

    @Override
    public String toString() {
        return getBrand() + brand + getModel() + model + getEngineVolume() + engineVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
