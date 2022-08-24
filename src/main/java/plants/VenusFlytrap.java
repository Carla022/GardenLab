package plants;

public class VenusFlytrap extends Plant {

//    PROPERTIES-------
    private boolean HasTriggerHair;

    private String canEat ;

//    CONSTRUCTOR--------

    public VenusFlytrap (String name, String category, double size, String colour, String thirst, String canEat, boolean HasTriggerHair){
        super (name,category, size,colour, thirst);
        this.canEat = canEat;
        this.HasTriggerHair = true;

    }

    public void addWaterproofing(){
        setHasTriggerHair(false);
    }



//    GETTERS + SETTERS--------


    public String canEat(){
        return "Mmm, I am full!";

    }

    public boolean isTriggerHair() {
        return HasTriggerHair;
    }

    public void setHasTriggerHair(boolean HasTriggerHair) {
        this.HasTriggerHair = HasTriggerHair;
    }




}

