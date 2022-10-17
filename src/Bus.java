public class Bus extends Transport implements Competing{


    public Bus(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);
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
        return "Машина: " + super.toString();
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
