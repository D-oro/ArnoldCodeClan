package dealership_management;
// has a vehicleType
public class Car extends VehicleTypes {

    private Tyres tyres;

    public Car(Tyres tyres, Colour colour, String engine, int price){
        super(colour, engine, price);
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getTyresAsString(){
        return tyres.getTyresAsString();
    }


}
