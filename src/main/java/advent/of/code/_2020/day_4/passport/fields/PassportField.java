package advent.of.code._2020.day_4.passport.fields;

public abstract class PassportField {
    protected String value;
    public abstract boolean isValid();

    public PassportField(String value) {
        this.value = value;
    }
}
