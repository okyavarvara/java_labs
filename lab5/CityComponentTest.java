import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class CityComponentTest {
    @Test
    public void testAddBuildingToDistrict() {
        CityComponent district = new District("центральний район");
        CityComponent building = new Building("будівля А");

        district.add(building);

        assertEquals(1, district.getChildren().size());
        assertTrue(district.getChildren().contains(building));
    }

    @Test
    public void testDisplayDetails() {
        CityComponent district = new District("центральний район");
        CityComponent building = new Building("будівля А");
        CityComponent sensor = new Sensor("датчик температури");

        district.add(building);
        building.add(sensor);

        String expectedDetails =
                """
                район: центральний район
                  будівля: будівля А
                    датчик: датчик температури
                """;

        assertEquals(expectedDetails.trim(), district.displayDetails().trim());
    }
}
