import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverPrivateTest {

    @Test
    public void testDriverNum() throws Exception{
        System.out.println("testDriverNum");

        Driver target = new Driver("John",101);

        Class secretClass = target.getClass();

        Field f = secretClass.getDeclaredField("driverNum");


        f.setAccessible(true);

        System.out.println("The value of f (driverNum) is " + f.get(target));

        f.set(target,102);

        int result = f.getInt(target);

        assertEquals(101, result);
    }
}