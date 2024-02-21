import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    Driver dan = new Driver("Danny", 101);

    @Test public void test_getDriverInfo(){

        assertEquals("Danny",dan.getDriverName());
        assertEquals(101,dan.getDriverNum());

    }

}