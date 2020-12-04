package advent.of.code._2020.day_4.passport.fields;

public class IssueYear extends PassportField {
    public IssueYear(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        try {
            final int year = Integer.parseInt(value);
            if (year < 2010 || year > 2020) return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
