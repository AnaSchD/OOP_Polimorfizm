public enum TypeLoadCapacity {

    N1(0D, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null );

    private final Double DESCRIPTION_FROM;
    private final Double DESCRIPTION_TO;

    TypeLoadCapacity(Double DESCRIPTION_FROM, Double DESCRIPTION_TO) {
        this.DESCRIPTION_FROM = DESCRIPTION_FROM;
        this.DESCRIPTION_TO = DESCRIPTION_TO;
    }

    public Double getDESCRIPTION_FROM() {
        return DESCRIPTION_FROM;
    }

    public Double getDESCRIPTION_TO() {
        return DESCRIPTION_TO;
    }



}
