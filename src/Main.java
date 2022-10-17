public class Main {
    public static void main(String[] args) {

        PassengerCars car1 = new PassengerCars(" Veyron 16.4 ", "Bugatti", 2.5);
        PassengerCars car2 = new PassengerCars(" FF ", "Ferrari", 3.5);
        PassengerCars car3 = new PassengerCars(" Carrera ", "Porshe 911", 2.5);
        PassengerCars car4 = new PassengerCars(" Turbo ", "Porshe 911", 1.5);

        car1.pitStop();


        Trucks truck1 = new Trucks(" 6561 ", "КАМАЗ", 5.6);
        Trucks truck2 = new Trucks(" HD-65 ", "Hyundai", 5.6);
        Trucks truck3 = new Trucks(" Unimog U5000 ", "Mercedes", 5.6);
        Trucks truck14 = new Trucks(" Auman BJ 1093 ", "Foton", 5.6);


        Bus bus1 = new Bus(" 3205 ", "ПАЗ", 4.7);
        Bus bus2 = new Bus(" 677 ", "Ли-Аз", 4.7);
        Bus bus3 = new Bus(" 5239 ", "НефАЗ", 4.7);
        Bus bus4 = new Bus(" 456 ", "Уаз", 4.7);


        DriverB maxim = new DriverB("Ivanov Maxim Ivanovich", 'B', 3.2, car1);
        DriverC alexander = new DriverC("Petrov Alexander Alexandrovich", 'C', 4.5, truck2);
        DriverD ivan = new DriverD("Alekseev Aleksey Alekseevich", 'D', 6.4, bus3);


        maxim.printDriver();
        alexander.printDriver();
        ivan.printDriver();

    }
}