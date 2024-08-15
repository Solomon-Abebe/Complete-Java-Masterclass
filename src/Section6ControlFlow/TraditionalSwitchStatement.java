package Section6ControlFlow;

public class TraditionalSwitchStatement {
    public static String getQuarter(String month){

        switch(month){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st Quarter";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd Quarter";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd Quarter";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th Quarter";

        }
        return "bad";
    }

    public static void main(String[] args) {

        System.out.println(getQuarter("JANUARY"));
    }

}
