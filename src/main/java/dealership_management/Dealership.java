package dealership_management;


import java.util.ArrayList;

//Dealership will have stock of different types of cars and a till.
public class Dealership {

    private int till;

    private ArrayList<Car> stock;

    private Customer customer;

    public Dealership(int till) {
        this.till = till;
        stock = new ArrayList<Car>();
    }

    public void sellCar(Car car, Customer customer) {
         if (customer.getMoney() > car.getPrice()){
        customer.reduceMoneyByCarPrice(car);
        increaseTillByCarPrice(car);
        removeCar(car);
        customer.addCar(car);
        }
         else{
             System.out.println("would you like to pay in installments?");;
         }
    }

    public void buyCar(Car car){
        reduceTillByCarPrice(car);
        addCar(car);
    }

    public void reduceTillByCarPrice(Car car){
        int moneyLeft = this.till - car.getPrice();
        setTill(moneyLeft);
    }

    public void increaseTillByCarPrice(Car car){
        int moreMoney = this.till + car.getPrice();
        setTill(moreMoney);
    }

    public void addCar(Car car){
        stock.add(car);
    }

    public void removeCar(Car car){
        stock.remove(car);
    }


    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }
}
