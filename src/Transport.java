import java.util.ArrayList;
import java.util.List;

public abstract class Transport {

    private String model;
    private String brand;
    private double engineVolume;

    private List <Driver<?>> drivers = new ArrayList<>();
    private List <Mechanic<?>> mechanics = new ArrayList<>();
    private List <Sponsor> sponsors = new ArrayList<>();


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

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public abstract void startMoving();

    public abstract void finishTheMoving();

    public abstract void printType(Driver<?> driver, Transport transport);

    public abstract boolean passDiagnostics ()throws DiagnosticsException;

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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }
    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
