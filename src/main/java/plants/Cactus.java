package plants;

import jdk.jfr.Category;

public class Cactus extends Plant{

//    PROPERTIES-------
    private boolean hasDefense;

//    CONSTRUCTOR--------

    public Cactus (String name, String category, double size, String colour, String  thirst, boolean hasDefense) {
        super (name,category, size,colour, thirst);
        this.hasDefense = hasDefense;


    }

// GETTERS + SETTERS--------


    public boolean isHasDefense() {
        return hasDefense;
    }

    public boolean setHasDefense(){
        return true;
    }


    }

//
//     if (Cactus.IshasDefense()==(true)) {
//        System.out.println("I have thorns");
//    }

