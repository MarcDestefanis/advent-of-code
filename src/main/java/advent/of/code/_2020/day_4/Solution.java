package advent.of.code._2020.day_4;

import java.util.List;

public class Solution {

    public int solve(List<String> inputs, int part) {
        String passportInfo = "";
        int valid = 0;
        for(String input : inputs) {
            passportInfo += input + " ";
            if(input.equals("")) {
                Passport passport = Passport.from(passportInfo);
                valid += passport.validate(part)? 1 : 0;
                passportInfo = "";
            }
        }
        Passport passport = Passport.from(passportInfo);
        valid += passport.validate(part)? 1 : 0;
        return valid;
    }
}
