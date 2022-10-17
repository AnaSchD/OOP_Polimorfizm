public class Bus extends Transport implements Competing {

    public enum TypeCapacity {ESPECIALLY_SMALL, SMALL, AVERAGE, BIG, ESPECIALLY_BIG}


    public Bus(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);
    }

    private String description;

    public Bus(String model, String brand, double engineVolume, String description) {
        super(model, brand, engineVolume);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void startMoving() {
        System.out.println("Включить электронные системы автобуса,запустить двигатель");
    }

    @Override
    public void finishTheMoving() {
        System.out.println("Выключить двигатель и электронные системы автобуса");
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Заехать в ремонт");
        System.out.println("Отремонтировать автобус");
        System.out.println("Дозаправить автобус");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время у автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автобуса");
    }
}
