package Section5ExpressionsStatements;

public class MethodOverloadingChallenge {
    public static double convertToCentimeters(double inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int foot, int inches){
        double inch =foot * 12 +inches;
        return convertToCentimeters(inch);
    }

    public static void main(String[] args) {
        System.out.println( convertToCentimeters(5,8));
    }
}
