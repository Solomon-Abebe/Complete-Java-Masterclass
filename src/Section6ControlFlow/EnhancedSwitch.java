package Section6ControlFlow;

public class EnhancedSwitch {
    public static String getQuarterEnhanced(String month) {
        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                return "1st Quarter";
            }
            case "APRIL", "MAY", "JUNE" -> {
                return "2nd Quarter";
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> {
                return "3rd Quarter";
            }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                return "4th Quarter";
            }
        }
        return "bad";
    }


    public static void main(String[] args) {

        System.out.println(getQuarterEnhanced("DECEMBER"));
    }
}
