package plants;

import jdk.jfr.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CactusTest {

    private Cactus cactus;

    @BeforeEach
    public void setUp() {
        cactus = new Cactus("Pickle", "I belong to OrnamentPlot", 10, "Green", "I am hydrated!", true);
    }

    @Test
    public void myName(){
        String actual = cactus.getName();
        String expected = "Pickle";
        assertEquals(expected, actual);

    }

    @Test
    public void myPlot(){
        String actual = cactus.getCategory();
        String expected = "I belong to OrnamentPlot";
        assertEquals(expected, actual);

    }

    @Test
    public void hasDefenseType() {
        boolean actual = cactus.isHasDefense();
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void colourOfPlant(){
        String actual = cactus.getColour();
        String expected = "Green";
        assertEquals(expected, actual);

    }

    @Test
    public void myHeight() {
        double actual = cactus.getSize();
        double expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void WaterStatus() {
        String actual = cactus.getThirst();
        String expected = "I am hydrated!";
        assertEquals(expected, actual);
    }




}
