public class CalendarConverter {
    private final static int MONDAY = 1;
    private final static int THUSDAY = 2;
    private final static int WENDSDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String day = "";

        switch (dayNumber) {
            case MONDAY:
                day = "Poniedzialek";
                break;
            case THUSDAY:
                day = "Wtorek";
                break;
            case WENDSDAY:
                day = "Sroda";
                break;
            case THURSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piatek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;

        }
        return day;
    }
}
