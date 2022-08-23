package plants;

public class VenusFlytrap extends Plant {

//    PROPERTIES-------
    private boolean hasTriggerHair;

    private String canEat ;

//    CONSTRUCTOR--------

    public VenusFlytrap (String name, String category, double size, String colour, String thirst, String canEat, boolean hasTriggerHair){
        super (name,category, size,colour, thirst);
        this.canEat = canEat;
        this.hasTriggerHair = hasTriggerHair;

    }

//    GETTERS + SETTERS--------


    public String canEat(){
        return "Mmm, I am full!";

    }

    public boolean isHasTriggerHair(){
        return true;

    }




}

