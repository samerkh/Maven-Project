import org.junit.Assert;
import org.junit.Test;

public class CalendarTest {

    @Test
    public void isLeapYear() {
        Calendar c = new Calendar();

        c.setYear(2000);
        Assert.assertTrue(c.isLeapYear());

        c.setYear(2020);
        Assert.assertTrue(c.isLeapYear());

    }

}
