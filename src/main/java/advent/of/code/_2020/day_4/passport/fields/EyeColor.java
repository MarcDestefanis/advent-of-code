package advent.of.code._2020.day_4.passport.fields;

import java.util.List;

public class EyeColor extends PassportField {
    private List<String> colors = List.of("amb", "blu", "brn", "gry", "grn", "hzl", "oth");

    public EyeColor(String value) {
        super(value);
    }

    @Override
    public boolean isValid() {
        return colors.contains(value);
    }
}
