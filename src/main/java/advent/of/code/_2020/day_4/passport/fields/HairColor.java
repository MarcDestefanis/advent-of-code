package advent.of.code._2020.day_4.passport.fields;

public class HairColor extends PassportField {
    public HairColor(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        if (value.length() != 7) return false;
        if (value.charAt(0) != '#') return false;
        for(char c : value.toCharArray()) {
            if (c <= '0' && c >= '9' && c <= 'a' && c >= 'f') return false;
        }
        return true;
    }
}
