public class Bus extends Transport implements Competing {

    private TypeCapacity typeCapacity;

    public Bus(String model, String brand, double engineVolume, TypeCapacity typeCapacity) {
        super(model, brand, engineVolume);
        this.typeCapacity = typeCapacity;
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    public void setTypeCapacity(TypeCapacity typeCapacity) {
        this.typeCapacity = typeCapacity;
    }

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
    public void printType(Driver <?> driver, Transport transport) {
        if (typeCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {

            System.out.println("Грузоподъемность от " + typeCapacity.getDESCRIPTION_FROM() + " до "+ typeCapacity.getDESCRIPTION_TO());
        }
    }

    @Override
    public boolean passDiagnostics() throws DiagnosticsException {
        return false;
//        throw new DiagnosticsException ("Автобус " + getBrand() + getModel() + " в диагностике не нуждается");
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
