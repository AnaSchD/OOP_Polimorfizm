public enum TypeCapacity {

    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(40, 50),
    BIG(60, 80),
    ESPECIALLY_BIG(100, 120);

    private final int DESCRIPTION_FROM;
    private final int DESCRIPTION_TO;

    TypeCapacity(int DESCRIPTION_FROM, int DESCRIPTION_TO) {
        this.DESCRIPTION_FROM = DESCRIPTION_FROM;
        this.DESCRIPTION_TO = DESCRIPTION_TO;
    }

    public int getDESCRIPTION_FROM() {
        return DESCRIPTION_FROM;
    }

    public int getDESCRIPTION_TO() {
        return DESCRIPTION_TO;
    }


}
