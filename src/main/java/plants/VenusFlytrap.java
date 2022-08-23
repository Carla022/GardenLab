package plants;

public class VenusFlytrap extends Plant {

//    PROPERTIES-------
    private boolean hasTriggerHair;

    private String canEat ;

//    CONSTRUCTOR--------

    public VenusFlytrap (String name, String category, double size, String colour, boolean canDrink, String canEat, boolean hasTriggerHair){
        super (name,category, size,colour, canDrink);
        this.canEat = canEat;
        this.hasTriggerHair = hasTriggerHair;

    }

//    PROPERTIES--------

    public String canEat(){
        return "Mmm, I am full!";
    }




}

