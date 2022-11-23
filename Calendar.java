public class Calendar {
    int day,month,year;
    public Calendar(int day,int month,int year){
         this.day=day;
         this.month=month;
         this.year=year;
    }

    public Calendar getNextDate(Calendar calendar){
         CalendarChecker calendarChecker=new CalendarChecker();
         if(calendarChecker.isEndOfAnyMonth(calendar)){
             calendar.day=1;
             calendar.month++;
         }
         else if(calendarChecker.isEndOfTheYear(calendar)){
             calendar.year++;
             calendar.month=1;
             calendar.day=1;
         }
         else{
             calendar.day++;
         }
         return calendar;
    }
}