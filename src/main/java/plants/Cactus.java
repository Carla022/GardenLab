package plants;

import jdk.jfr.Category;

public class Cactus extends Plant{

//    PROPERTIES-------
    private String hasDefense;

    public Cactus (String name, String category, double size, String colour, boolean canDrink, String hasDefense) {
        super (name,category, size,colour, canDrink);
        this.hasDefense = hasDefense;


    }

}
