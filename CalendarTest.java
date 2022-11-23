import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalendarTest {
    @Test
    public void endofOddMonthtest(){
        Calendar calendar=new Calendar(31,7,2022);
        int expday=1,expmonth=8,expyear=2022;
        assertEquals(expday,calendar.getNextDate(calendar).day);
        assertEquals(expmonth,calendar.getNextDate(calendar).month);
        assertEquals(expyear,calendar.getNextDate(calendar).year);
    }
    @Test
    public void endofEvenMonthTest(){
        Calendar calendar=new Calendar(30,4,2022);
        int expday=1,expmonth=5,expyear=2022;
        assertEquals(expday,calendar.getNextDate(calendar).day);
        assertEquals(expmonth,calendar.getNextDate(calendar).month);
        assertEquals(expyear,calendar.getNextDate(calendar).year);
    }
    @Test
    public void endofFebruaryTest(){
        Calendar calendar=new Calendar(28,2,2022);
        int expday=1,expmonth=3,expyear=2022;
        assertEquals(expday,calendar.getNextDate(calendar).day);
        assertEquals(expmonth,calendar.getNextDate(calendar).month);
        assertEquals(expyear,calendar.getNextDate(calendar).year);
    }
    @Test
    public void februaryofLeapyrTest(){
        Calendar calendar=new Calendar(29,2,2000);
        int expday=1,expmonth=3,expyear=2000;
        assertEquals(expday,calendar.getNextDate(calendar).day);
        assertEquals(expmonth,calendar.getNextDate(calendar).month);
        assertEquals(expyear,calendar.getNextDate(calendar).year);
    }
    @Test
    public void endofyearTest(){
        Calendar calendar=new Calendar(31,12,2000);
        int expday=1,expmonth=1,expyear=2001;
        assertEquals(expday,calendar.getNextDate(calendar).day);
        assertEquals(expmonth,calendar.getNextDate(calendar).month);
        assertEquals(expyear,calendar.getNextDate(calendar).year);
    }
    @Test
    public void othersDateTest(){
        Calendar calendar=new Calendar(15,2,2000);
        int expday=16,expmonth=2,expyear=2000;
        assertEquals(expday,calendar.getNextDate(calendar).day);
        assertEquals(expmonth,calendar.getNextDate(calendar).month);
        assertEquals(expyear,calendar.getNextDate(calendar).year);
    }
}
