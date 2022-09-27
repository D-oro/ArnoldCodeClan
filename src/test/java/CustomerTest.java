import dealership_management.Car;
import dealership_management.Colour;
import dealership_management.Customer;
import dealership_management.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before public void before(){
        customer = new Customer(100000);
        car = new Car(Tyres.WINTER, Colour.BLUE, "VR6", 45000);
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(55000, customer.getMoney());
        assertEquals(1, customer.getNumberOfOwnedCars());
    }

    @Test
    public void canReduceMoneyByCarPrice(){
        customer.reduceMoneyByCarPrice(car);
        assertEquals(55000, customer.getMoney());
    }

    @Test
    public void hasMoney(){
        assertEquals(100000, customer.getMoney());
    }

    @Test
    public void canGetNumberOfOwnedCars(){
        customer.addCar(car);
        assertEquals(1, customer.getNumberOfOwnedCars());
    }



}
