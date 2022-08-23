package plants;

import jdk.jfr.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class VenusFlytrapTest {
    //
    private VenusFlytrap venusFlytrap;

    @BeforeEach
    public void setUp() {
        venusFlytrap = new VenusFlytrap("Piranha", "I belong to CarnivorousPlot", 6, "Green and Red", "I am hydrated!", "Mmm, I am full!", true);
    }

    @Test
    public void canEat() {
        String expected = "Mmm, I am full!";
        String actual = venusFlytrap.canEat();
        assertEquals(expected, actual);
    }

    @Test
    public void myName() {
//        //When
        String actual = venusFlytrap.getName();
        //Then
        String expected = "Piranha";
//       assertEquals(expected).isEqualTo(actual);

        assertEquals(expected, actual);

    }

    @Test
    public void hydrationStatus() {
//        //When
        String actual = venusFlytrap.getThirst();
        //Then
        String expected = "I am hydrated!";
//       assertEquals(expected).isEqualTo(actual);

        assertEquals(expected, actual);

    }

    @Test
    public void height() {
        double expected = 6;
        double actual = venusFlytrap.getSize();
        assertEquals(expected, actual);

    }

    @Test
    public void typeOfPlot() {
        String expected = "I belong to CarnivorousPlot";
        String actual = venusFlytrap.getCategory();
        assertEquals(expected, actual);

    }

    @Test
    public void colourOfPlant() {
        String expected = "Green and Red";
        String actual = venusFlytrap.getColour();
        assertEquals(expected, actual);

    }
//need help creating a boolean test::
    @Test
    public boolean canCheckIfPlantHasCloseTimer() {


}








