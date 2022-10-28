public class Sponsor <T extends Transport> {

    private String name;
    private int amountOfSupport;


    public Sponsor(String name, int amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorTheRace (Transport transport) {
        System.out.println("Спонсор " + name + " спонсировал заезд " + transport.getModel()+ transport.getBrand() + " суммой: " + amountOfSupport);
    }

    public String getName() {
        return name;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", amountOfSupport=" + amountOfSupport +
                '}';
    }
}
