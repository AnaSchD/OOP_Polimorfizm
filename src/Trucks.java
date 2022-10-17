public class Trucks extends Transport implements Competing {


    public enum TypeLoadCapacity {
        N1 ("с полной массой до 3,5 тонн"), N2 ("с полной массой свыше 3,5 до 12 тонн"),
        N3 ("с полной массой свыше 12 тонн");

        private String description;

        TypeLoadCapacity(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
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
