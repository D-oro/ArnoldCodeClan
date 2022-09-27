package dealership_management;

//import behaviours.IHasCars;

import java.util.ArrayList;

//Customers will have money and a collection of owned vehicles.
public class Customer {
    private int money;
    private ArrayList<Car> ownedCars;


    public Customer(int money){
        this.money = money;
        ownedCars = new ArrayList<Car>();
    }

    public void buyCar(Car car){
        reduceMoneyByCarPrice(car);
        addCar(car);
    }

    public void reduceMoneyByCarPrice(Car car){
        int moneyLeft = this.money - car.getPrice();
        setMoney(moneyLeft);
    }

    public void addCar(Car car){
        ownedCars.add(car);
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumberOfOwnedCars() {
        return ownedCars.size();
    }


}
