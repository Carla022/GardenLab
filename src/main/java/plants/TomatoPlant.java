package plants;

import jdk.jfr.Category;

public class TomatoPlant extends Plant{

    private int fruit;
    private boolean canHarvest;

    public TomatoPlant (String name, String category, double size, String colour, boolean canDrink, int fruit, boolean canHarvest) {
        super(name, category, size, colour, canDrink);
        this.fruit = fruit;
        this.canHarvest = canHarvest;
    }
}
