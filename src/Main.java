import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {


    public static void main(String[] args) throws DiagnosticsException {


        List<List<Integer>> biDemArrList = new ArrayList<>();


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

        //check(bus1, truck2, car1, truck3, truck1);


        DriverB maxim = new DriverB("Ivanov Maxim Ivanovich", 'B', 3.2, car1);
        DriverC alexander = new DriverC("Petrov Alexander Alexandrovich", 'C', 4.5, truck2);
        DriverD ivan = new DriverD("Alekseev Aleksey Alekseevich", 'D', 6.4, bus3);
//

        Sponsor vasya = new Sponsor<>("Vasya", 25000);
        Sponsor misha = new Sponsor<>("Misha", 2000);
        Sponsor sasha = new Sponsor<>("Sasha", 13000);

        Mechanic petya = new Mechanic<>("Petya", "Petrov", "Lada", truck3);
        Mechanic zhenya = new Mechanic<>("Zhenya", "Ivanov", "Lada2", bus3);
        Mechanic ilya = new Mechanic<>("Ilya", "Petrov", "Lada", car3);


//
//        bus1.addDriver(maxim);
//
//        bus1.addMechanic(zhenya);
//        bus1.addMechanic(ilya);
//        bus1.addMechanic(petya);
//
//        bus1.addSponsor(vasya);
//        bus1.addSponsor(misha);
//        bus1.addSponsor(sasha);
//
//        infoTransport(bus1);


//        ServiceStation <Transport> transportServiceStation = new ServiceStation<>();
//
//        transportServiceStation.addTransportToQueue(truck2);
//        transportServiceStation.addTransportToQueue(car1);
//        transportServiceStation.addTransportToQueue(bus1);
//
//        System.out.println(transportServiceStation);
//
//        transportServiceStation.technicalInspection(truck2);
//        transportServiceStation.technicalInspection(car1);
//
//        System.out.println(transportServiceStation);


        example();
//
//        alexander.printDriver();
//        truck2.printType(alexander, truck3);
//
//        ivan.printDriver();
//        bus2.printType(ivan, bus1);
//        maxim.printDriver();
//        car1.printType(maxim, car3);
    }

    public static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        biDemArrList.get(i).add(j, "◯");
                    } else {
                        biDemArrList.get(i).add(j, "●");
                    }
                } else {
                    if (j % 2 != 0) {
                        biDemArrList.get(i).add(j, "◯");
                    } else {
                        biDemArrList.get(i).add(j, "●");
                    }
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

    public static void check(Transport... transports) throws DiagnosticsException {
        for (Transport transport : transports) {
            if (transport.getClass() == Bus.class) {
                System.out.println("Автобус " + transport.getBrand() + " в диагностике не нуждается");
                continue;
            }
            if (!transport.passDiagnostics()) {
                throw new DiagnosticsException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            } else {
                System.out.println(transport.getBrand() + " " + transport.getModel() + " прошел диагностику");
            }

        }
    }

    public static void infoTransport(Transport transport) {
        System.out.println(transport.getDrivers());
        System.out.println(transport.getMechanics());
        System.out.println(transport.getSponsors());
    }

    private Queue<String> queue1 = new ArrayDeque<>(5);
    private Queue<String> queue2 = new ArrayDeque<>(5);


    public void add() {
        for (int i = 0; i < Math.random() * 5; i++) {
            queue1.offer("Mike" + i);
        }
        for (int i = 0; i < Math.random() * 5; i++) {
            queue2.offer("Mike" + i);
        }
        System.out.println(queue1);
        System.out.println(queue2);
    }

    public void queue3 (String name, Queue <String> q1, Queue<String> q2) {
        if (q1.size() == q2.size() && q1.size() == 5) {
            System.out.println("Галя!");
            return;
        }
        if (q1.size() < q2.size()) {
            q1.add(name);
        }
        if (q2.size() < q1.size()) {
            q2.add(name);
        }
    }




}