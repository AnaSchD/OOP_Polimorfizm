import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport {

    private String model;
    private String brand;
    private double engineVolume;

    private Set<Driver<?>> drivers = new HashSet<>();
    private Set <Mechanic<?>> mechanics = new HashSet<>();
    private Set <Sponsor> sponsors = new HashSet<>();


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

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }
    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    public Set<Sponsor> getSponsors() {
        return sponsors;
    }


}
