package plants;

public abstract class Plant {

//    PROPERTIES-------------

    private String name;
    private String category;
    private double size;
    private String colour;

    private String thirst;


//    CONSTRUCTOR--------------

    public Plant(String name, String category, double size, String colour, String thirst) {
        this.name = name;
        this.category = category;
        this.size = size;
        this.colour = colour;
        this.thirst = thirst;
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

//    METHODS--------

    public String Thirst() {
        return "I am hydrated!";

    }
}


