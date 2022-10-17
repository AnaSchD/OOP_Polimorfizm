import java.util.Objects;

public abstract class Transport {

    private String model;
    private String brand;
    private double engineVolume;


    public Transport(String model, String brand, double engineVolume) {

        if (model == null || model.isEmpty()) {
            this.model = "Напишите модель";
        } else {
            this.model = model;
        }

        if (brand == null || brand.isEmpty()) {
            this.brand = "Напишите бренд";
        } else {
            this.brand = brand;
        }

        if (engineVolume < 0) {
            this.engineVolume = 0;
            System.out.println("Напишите объем двигателя");
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void finishTheMoving();

    public abstract void  printType ();


    @Override
    public String toString() {
        return getBrand() + brand + getModel() + model + getEngineVolume() + engineVolume;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


}
