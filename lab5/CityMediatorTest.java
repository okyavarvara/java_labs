import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityMediatorTest {
    @Test
    public void testRegisterAndCommunicate() {
        CityMediator cityMediator = new CityControlCenter();
        TransportationSystem transport = new TransportationSystem(cityMediator);
        LightingSystem lighting =  new LightingSystem(cityMediator);

        ((CityControlCenter) cityMediator).registerSystem("транспорт", transport);
        ((CityControlCenter) cityMediator).registerSystem("освітлення", lighting);

        transport.reportCongestion();

        assertEquals("система дорожнього руху", transport.displayDetails());
        assertEquals("система освітлення", lighting.displayDetails());
    }
}