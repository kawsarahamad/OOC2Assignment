public interface ICalendarTypeSpecifier {
    boolean isEndOfOddMonth(Calendar calendar); //odd month means 31 days month
    boolean isEndOfEvenMonth(Calendar calendar); // even month means 30 days month
    boolean isEndOfTheYear(Calendar calendar);

    boolean isEndOfFebruary(Calendar calendar);

    boolean isEndOfAnyMonth(Calendar calendar);
}
