import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityMediatorTest {
    @Test
    public void testRegisterAndCommunicate() {
        CityMediator cityMediator = new CityControlCenter();
        TransportationSystem transportation = new TransportationSystem(cityMediator);
        LightingSystem lighting =  new LightingSystem(cityMediator);

        ((CityControlCenter) cityMediator).registerSystem("транспорт", transportation);
        ((CityControlCenter) cityMediator).registerSystem("освітлення", lighting);

        transportation.reportCongestion();

        assertEquals("система дорожнього руху", transportation.displayDetails());
        assertEquals("система освітлення", lighting.displayDetails());
    }
}