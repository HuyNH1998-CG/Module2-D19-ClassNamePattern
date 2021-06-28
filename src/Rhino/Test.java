package Rhino;

public class Test {
    private static ClassNamePattern classNamePattern;
    public static final String[] validName = new String[]{"C0318G"};
    public static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        classNamePattern = new ClassNamePattern();
        for (String e : validName) {
            boolean isValid = classNamePattern.validate(e);
            System.out.println(e + " is valid: " + isValid);
        }
        for (String e : invalidName) {
            boolean isValid = classNamePattern.validate(e);
            System.out.println(e + " is valid: " + isValid);
        }
    }
}
