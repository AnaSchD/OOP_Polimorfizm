public class Trucks extends Transport implements Competing {


    private TypeLoadCapacity typeLoadCapacity;

    public Trucks(String model, String brand, double engineVolume, TypeLoadCapacity typeLoadCapacity) {
        super(model, brand, engineVolume);
        this.typeLoadCapacity = typeLoadCapacity;
    }

    public TypeLoadCapacity getTypeLoadCapacity() {
        return typeLoadCapacity;
    }

    public void setTypeLoadCapacity(TypeLoadCapacity typeLoadCapacity) {
        this.typeLoadCapacity = typeLoadCapacity;
    }

    public Trucks(String model, String brand, double engineVolume) {
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
    public void printType() {
        if (typeLoadCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            String DESCRIPTION_FROM = typeLoadCapacity.getDESCRIPTION_FROM() == null ? "" : "от" + typeLoadCapacity.getDESCRIPTION_FROM() + " ";
            String DESCRIPTION_TO = typeLoadCapacity.getDESCRIPTION_TO() == null ? "" : " до" + typeLoadCapacity.getDESCRIPTION_TO();
            System.out.println("Грузоподъемность от " + DESCRIPTION_FROM + DESCRIPTION_TO);
        }
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Заехать в ремонт");
        System.out.println("Отремонтировать грузовую машину");
        System.out.println("Дозаправить грузовую машину");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время у грузовой машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовой машины");
    }
}
