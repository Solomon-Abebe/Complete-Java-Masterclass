package Section5ExpressionsStatements;

//
//public class SpeedConverter{
//    // write code here
//    public static long toMilesPerHour(double kilometersPerHour){
//
//        if (kilometersPerHour < 0){
//            return -1;
//        }
//        return Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion(double kilometersPerHour){
//        if(kilometersPerHour<0){
//            System.out.println("Invalid input");
//            return;
//        }
//        long milesPerHour = toMilesPerHour(kilometersPerHour);
//        System.out.println(kilometersPerHour + " km/h" + " = " + milesPerHour + " mi/h.");
//
//    }
//}

//***************************
public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
