package dealership_management;

public enum Tyres {
    WINTER("winter tyres"),
    SUMMER("summer tyres"),
    FLAT("flat tyres");

    private final String tyres;

    Tyres(String tyres){
        this.tyres = tyres;
    }

    public String getTyresAsString(){
        return tyres;
    }
}

