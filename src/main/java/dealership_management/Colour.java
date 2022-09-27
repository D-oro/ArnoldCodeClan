package dealership_management;

public enum Colour {
    BLACK("black"),
    SILVER("silver"),
    BLUE("blue"),
    RED("red"),
    GREEN("green"),
    YELLOW("yellow"),
    PINK("pink"),
    ORANGE("orange"),
    TURQUOISE("turquoise");

    private final String colour;

    Colour(String colour){
        this.colour = colour;
    }

    public String getColourAsString() {
        return colour;
    }
}

