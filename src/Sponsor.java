public class Sponsor {

    private String nameCompany;
    private int amountOfSupport;


    public Sponsor(String nameCompany, int amountOfSupport) {
        this.nameCompany = nameCompany;
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorTheRace () {
        System.out.println("Спонсор " + nameCompany + " спонсировал заезд суммой: " + amountOfSupport);
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }
}
