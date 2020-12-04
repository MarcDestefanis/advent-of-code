package advent.of.code._2020.day_4.passport.fields;

public class BirthYear extends PassportField {
    public BirthYear(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        try {
            final int year = Integer.parseInt(value);
            if (year < 1920 || year > 2002) return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
