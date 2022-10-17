public class PassengerCars extends Transport implements Competing {


    public PassengerCars(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Вставить ключ в замок зажигания и завести двигатель");
    }

    @Override
    public void finishTheMoving() {
        System.out.println("Нажать на тормоз, выключить двигатель и вытащить ключ из замка зажигания");
    }

    @Override
    public String toString() {
        return "Машина: " + super.toString();
    }


    @Override
    public void pitStop() {
        System.out.println("Заехать в ремонт");
        System.out.println("Отремонтировать легковую машину");
        System.out.println("Дозаправить легковую машину");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время у легковой машины");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у легковой машины");

    }
}
