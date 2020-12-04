package advent.of.code._2020.day_4.passport.fields;

public class Height extends PassportField {
    public Height(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        if (value.length() != 4 && value.length() != 5) return false;
        if (value.length() == 4) {
            if (!validateInch()) return false;
        }
        if (value.length() == 5) {
            if (!validateCm()) return false;
        }
        return true;
    }

    private boolean validateCm() {
        final String heightStr = value.substring(0, 3);
        try {
            final int height = Integer.parseInt(heightStr);
            if (height < 150 || height > 193) return false;
            if (!value.startsWith("cm", 3)) return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean validateInch() {
        final String heightStr = value.substring(0, 2);
        try {
            final int height = Integer.parseInt(heightStr);
            if (height < 59 || height > 76) return false;
            if (!value.startsWith("in", 2)) return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
