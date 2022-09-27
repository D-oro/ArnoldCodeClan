import com.sun.xml.internal.ws.api.pipe.Engine;
import dealership_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(Tyres.WINTER, Colour.BLUE, "VR6", 45000);}

    @Test
    public void hasTyres(){
        assertEquals("winter tyres", car.getTyresAsString());
    }

    @Test
    public void hasPrice(){
        assertEquals(45000, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", car.getColourAsString());
    }

    @Test
    public void hasEngine(){
        assertEquals("VR6", car.getEngine());
    }
}