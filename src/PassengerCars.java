public class PassengerCars extends Transport implements Competing {

    private TypeBody typeBody;

    public PassengerCars(String model, String brand, double engineVolume, TypeBody typeBody) {
        super(model, brand, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

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
    public void printType() {
        if (typeBody == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип легкового автомобиля: " + typeBody);
        }
    }

    @Override
    public String toString() {
        return super.toString();
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
