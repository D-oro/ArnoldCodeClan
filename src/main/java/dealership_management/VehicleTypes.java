package dealership_management;

//Create different vehicle types (e.g. Car, Electric Car, Hybrid Car, etc)
//Assign them various properties (e.g. price, colour, engine etc.)

public abstract class VehicleTypes {

    private Colour colour;
    private String engine;
    private int price;

    public VehicleTypes(Colour colour, String engine, int price){
        this.colour = colour;
        this.engine = engine;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public Colour getColour() {
        return colour;
    }

    public String getColourAsString(){
        return colour.getColourAsString();
    }

    public int getPrice() {
        return price;
    }
}
