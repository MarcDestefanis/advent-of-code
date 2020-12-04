package advent.of.code._2020.day_4.passport.fields;

public class ExpirationYear extends PassportField {
    public ExpirationYear(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        try {
            final int year = Integer.parseInt(value);
            if (year < 2020 || year > 2030) return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
