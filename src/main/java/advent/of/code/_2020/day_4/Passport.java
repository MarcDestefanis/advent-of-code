package advent.of.code._2020.day_4;

import advent.of.code._2020.day_4.passport.fields.CountryId;
import advent.of.code._2020.day_4.passport.fields.Fields;
import advent.of.code._2020.day_4.passport.fields.PassportField;

import java.util.ArrayList;
import java.util.List;

public class Passport {
    List<PassportField> fields;

    private Passport(List<PassportField> fields) {
        this.fields = fields;
    }

    public static Passport from(String passportInfo) {
        List<PassportField> fields = new ArrayList<>();
        final String[] tokens = passportInfo.split(" ");
        for (String token : tokens) {
            final String[] fieldData = token.split(":");
            String fieldName = fieldData[0];
            String fieldValue = fieldData[1];
            final Fields field = Fields.valueOf(fieldName.toUpperCase());
            final PassportField passportField = PassportFieldFactory.build(field, fieldValue);
            if (!(passportField instanceof CountryId)) {
                fields.add(passportField);
            }
        }
        return new Passport(fields);
    }

    public boolean validate(int part) {
        if (!requiredFieldsArePresent()) return false;
        if (part == 2) {
            if (!fieldsHaveValidValue()) return false;
        }
        return true;
    }

    private boolean requiredFieldsArePresent() {
        return fields.size() >= 7;
    }

    private boolean fieldsHaveValidValue() {
        return fields.size() == fields.stream().filter(PassportField::isValid).count();
    }
}
