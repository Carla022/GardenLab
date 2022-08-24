package plants;

import jdk.jfr.Category;

public class TomatoPlant extends Plant{

//    PROPERTIES-------
    private int fruit;
    private boolean canHarvest;

//    CONSTRUCTOR--------
    public TomatoPlant (String name, String category, double size, String colour,String thirst, int fruit, boolean canHarvest) {
        super(name, category, size, colour, thirst);
        this.fruit = fruit;
        this.canHarvest = canHarvest;
    }

//    GETTERS + SETTERS-------









}
