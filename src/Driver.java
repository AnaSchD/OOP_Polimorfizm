public abstract class Driver<T extends Transport & Competing> {

    private String fullName;
    private Character typeOfRight;
    private double experience;

    private T car;

    public Driver(String fullName, Character typeOfRight, double experience, T car) {

        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Введите ФИО водителя";
        } else {
            this.fullName = fullName;
        }

        if (typeOfRight != 'B' && typeOfRight != 'C' && typeOfRight != 'D') {
            System.out.println("Необходимо получить права");
        } else {
            this.typeOfRight = typeOfRight;
        }

        if (experience == 0) {
            System.out.println("Тебе нельзя водить машину");
        } else {
            this.experience = experience;
        }

        if (car == null) {
            System.out.println("У водителя нет машины");
        } else {
            this.car = car;
        }
    }

    public void start() {
            System.out.println("Начать движение " + car.getBrand() + " " + car.getModel());
    }

    public void stop() {
        System.out.println("Остановиться на " + car.getBrand() + " " + car.getModel());
    }

    public void refill() {
        System.out.println("Заправить авто " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public String toString() {
        return "Водитель " + fullName + " с категорией прав " + typeOfRight + " и с опытом вождения " + experience;
    }

    public void printDriver() {
        System.out.println("Водитель " + fullName + " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет учавствовать в заезде.");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Character getTypeOfRight() {
        return typeOfRight;
    }

    public void setTypeOfRight(Character typeOfRight) {
        this.typeOfRight = typeOfRight;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
