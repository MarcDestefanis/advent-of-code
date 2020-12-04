package advent.of.code._2020.day_4.passport.fields;

public class PassportId extends PassportField {
    public PassportId(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        if (value.length() != 9) return false;
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
