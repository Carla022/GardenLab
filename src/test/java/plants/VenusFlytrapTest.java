package plants;

import jdk.jfr.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VenusFlytrapTest {
//
    private VenusFlytrap venusFlytrap;

    @BeforeEach
    public void setUp(){
        venusFlytrap = new VenusFlytrap ( " Piranha","Carnivorous", 6, "green and Red", true, "Mmm, I am full!", true);

    }

    @Test
    public void canEat(){
        String expected = "Mmm, I am full!";
        String actual = venusFlytrap.canEat();
        assertEquals(expected, actual);
    }

}
