package plants;

public abstract class Plant {

//    PROPERTIES-------------

    private String name;
    private String category;
    private double size;
    private String colour;
    private boolean canDrink;


//    CONSTRUCTOR--------------

    public Plant(String name, String category, double size, String colour, boolean canDrink) {
        this.name = name;
        this.category = category;
        this.size = size;
        this.colour = colour;
        this.canDrink = true;
    }

//    GETTERS + SETTERS----------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean canDrink() {
        return canDrink;
    }

    public void setCanDrink(boolean canDrink) {
        this.canDrink = canDrink;
    }
}
