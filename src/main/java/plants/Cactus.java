package plants;

import jdk.jfr.Category;

public class Cactus extends Plant{

//    PROPERTIES-------
    private String hasDefense;

    public Cactus (String name, String category, double size, String colour, String  thirst, String hasDefense) {
        super (name,category, size,colour, thirst);
        this.hasDefense = hasDefense;


    }



}
