public class CalendarChecker implements ICalendarTypeSpecifier {
    @Override
    public boolean isEndOfOddMonth(Calendar calendar){
        if ((calendar.month == 1 || calendar.month == 3 || calendar.month == 5 || calendar.month == 7 || calendar.month == 8 || calendar.month == 10) && calendar.day == 31) {
            return true;
        }
        else return false;
    }

    @Override
    public boolean isEndOfEvenMonth(Calendar calendar){
        if ((calendar.month == 4 || calendar.month == 6 || calendar.month == 9 || calendar.month == 11) && calendar.day == 30) {
            return true;
        }
        else return false;
    }
    public boolean isLeapYear(int year){
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        else return false;
    }
    @Override
    public boolean isEndOfFebruary(Calendar calendar) {
        if ((calendar.month == 2)) {
            if (isLeapYear(calendar.year)) {
                if (calendar.day == 29) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (calendar.day == 28) return true;
                else return false;
            }
        }
        else return false;
    }
    @Override
    public  boolean isEndOfTheYear(Calendar calendar){
        if(calendar.month==12 && calendar.day==31){
            return true;
        }
        else return false;
    }
    @Override
    public boolean isEndOfAnyMonth(Calendar calendar){
        if(isEndOfEvenMonth(calendar) || isEndOfOddMonth(calendar) || isEndOfFebruary(calendar)){
            return true;
        }
        else return false;
    }


}
