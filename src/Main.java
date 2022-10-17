public class Main {
    public static void main(String[] args) {

        PassengerCars car1 = new PassengerCars("Veyron 16.4", "Bugatti", 4.5);
        PassengerCars car2 = new PassengerCars("FF", "Ferrari", 4.5);
        PassengerCars car3 = new PassengerCars("Carrera", "Porshe 911", 4.5);
        PassengerCars car4 = new PassengerCars("Turbo", "Porshe 911", 4.5);

        car1.pitStop();


        Trucks truck1 = new Trucks("", "", 5.6);
        Trucks truck2 = new Trucks("", "", 5.6);
        Trucks truck3 = new Trucks("", "", 5.6);
        Trucks truck14 = new Trucks("", "", 5.6);


        Bus bus1 = new Bus("", "", 4.7);
        Bus bus2 = new Bus("", "", 4.7);
        Bus bus3 = new Bus("", "", 4.7);
        Bus bus4 = new Bus("", "", 4.7);


    }
}