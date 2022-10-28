public class Mechanic <T extends Transport> {

    private String name;
    private String surname;
    private String company;

    private Transport transport;

    public Mechanic(String name, String surname, String company, T transport) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.transport = transport;
    }

    public void fixTheTransport(T transport) {
        System.out.println("Механик " + name + surname + " починил машину " +
                transport.getModel() + transport.getBrand());
    }

    public void maintenance(T transport) {
        System.out.println("Механик " + name + surname + " провел диагностику транспортному средству " +
                transport.getModel() + transport.getBrand());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public Transport getTransport() {
        return transport;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                ", transport=" + transport +
                '}';
    }
}
