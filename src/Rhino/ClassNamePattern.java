package Rhino;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNamePattern {
    public static final String classRegex = "^[CAP][0-9]{4}[GHIKLM]$";

    public ClassNamePattern(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(classRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
