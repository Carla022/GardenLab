package plants;

import jdk.jfr.Category;

public abstract class Plant {

    private String name;

    private Category category;

    private double size;

    private String colour;

    private boolean canDrink;

    public Plant(String name, Category category, double size, String colour, boolean canDrink) {
        this.name = name;
        this.category = category;
        this.size = size;
        this.colour = colour;
        this.canDrink = true;
    }



}
