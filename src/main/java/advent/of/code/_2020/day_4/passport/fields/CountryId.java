package advent.of.code._2020.day_4.passport.fields;

public class CountryId extends PassportField {
    public CountryId(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
