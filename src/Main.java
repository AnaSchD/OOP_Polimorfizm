public class Main {
    public static void main(String[] args) throws DiagnosticsException {


        PassengerCars car1 = new PassengerCars(" Veyron 16.4 ", "Bugatti", 2.5, TypeBody.MINIVAN);
        PassengerCars car2 = new PassengerCars(" FF ", "Ferrari", 3.5, TypeBody.CROSSOVER);
        PassengerCars car3 = new PassengerCars(" Carrera ", "Porshe 911", 2.5, TypeBody.PICKUP);
        PassengerCars car4 = new PassengerCars(" Turbo ", "Porshe 911", 1.5, TypeBody.CROSSOVER);


        Trucks truck1 = new Trucks(" 6561 ", "КАМАЗ", 5.6, TypeLoadCapacity.N1);
        Trucks truck2 = new Trucks(" HD-65 ", "Hyundai", 5.6, TypeLoadCapacity.N2);
        Trucks truck3 = new Trucks(" Unimog U5000 ", "Mercedes", 5.6, TypeLoadCapacity.N3);
        Trucks truck14 = new Trucks(" Auman BJ 1093 ", "Foton", 5.6, TypeLoadCapacity.N2);


        Bus bus1 = new Bus(" 3205 ", "ПАЗ", 4.7, TypeCapacity.BIG);
        Bus bus2 = new Bus(" 677 ", "Ли-Аз", 4.7, TypeCapacity.AVERAGE);
        Bus bus3 = new Bus(" 5239 ", "НефАЗ", 4.7, TypeCapacity.SMALL);
        Bus bus4 = new Bus(" 456 ", "Уаз", 4.7, TypeCapacity.ESPECIALLY_SMALL);

        check(bus1, truck2, car1, truck3, truck1);


        DriverB maxim = new DriverB("Ivanov Maxim Ivanovich", 'B', 3.2, car1);
        DriverC alexander = new DriverC("Petrov Alexander Alexandrovich", 'C', 4.5, truck2);
        DriverD ivan = new DriverD("Alekseev Aleksey Alekseevich", 'D', 6.4, bus3);
//
//
//        alexander.printDriver();
//        truck2.printType(alexander, truck3);
//
//        ivan.printDriver();
//        bus2.printType(ivan, bus1);
//        maxim.printDriver();
//        car1.printType(maxim, car3);
    }

    public static void check(Transport... transports) throws DiagnosticsException {
        for (Transport transport : transports) {
            if (transport.getClass() == Bus.class) {
                System.out.println("Автобус " + transport.getBrand() + " в диагностике не нуждается");
                continue;
            }
            if (!transport.passDiagnostics()) {
                throw new DiagnosticsException(transport.getBrand()+ " " + transport.getModel() + " не прошел диагностику");
            } else {
                System.out.println(transport.getBrand()+ " " + transport.getModel() + " прошел диагностику");
            }

    }
}

}