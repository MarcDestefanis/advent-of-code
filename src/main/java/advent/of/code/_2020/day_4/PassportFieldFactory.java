package advent.of.code._2020.day_4;

import advent.of.code._2020.day_4.passport.fields.BirthYear;
import advent.of.code._2020.day_4.passport.fields.CountryId;
import advent.of.code._2020.day_4.passport.fields.ExpirationYear;
import advent.of.code._2020.day_4.passport.fields.EyeColor;
import advent.of.code._2020.day_4.passport.fields.Fields;
import advent.of.code._2020.day_4.passport.fields.HairColor;
import advent.of.code._2020.day_4.passport.fields.Height;
import advent.of.code._2020.day_4.passport.fields.IssueYear;
import advent.of.code._2020.day_4.passport.fields.PassportField;
import advent.of.code._2020.day_4.passport.fields.PassportId;

public class PassportFieldFactory {

    public static PassportField build(Fields fields, String value) {
        switch (fields){
            case BYR: return new BirthYear(value);
            case IYR: return new IssueYear(value);
            case EYR: return new ExpirationYear(value);
            case HGT: return new Height(value);
            case HCL: return new HairColor(value);
            case ECL: return new EyeColor(value);
            case PID: return new PassportId(value);
            case CID: return new CountryId(value);
            default: throw new IllegalArgumentException("Unknown field");
        }
    }
}
