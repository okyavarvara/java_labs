import java.util.HashMap;
import java.util.Map;

public class CityControlCenter implements CityMediator {
    private Map<String, CityComponent> systems = new HashMap<>();

    public void registerSystem(String systemName, CityComponent component) {
        systems.put(systemName, component);
    }


    @Override
    public void notify(String event, CityComponent sender) {
        switch (event) {
            case "LIGHT_ON":
                System.out.println("центр управління: вмикаємо освітлення у місті");
                break;
            case "EMERGENCY_ALERT":
                System.out.println("центр управління: сповіщення системи безпеки");
                if (systems.containsKey("Security")) {
                    ((SecuritySystem) systems.get("Security")).activateEmergencyProtocol();
                }
                break;
            case "TRAFFIC_CONGESTION":
                System.out.println("центр управління: регулювання дорожніх сигналів");
                if (systems.containsKey("Lighting")) {
                    ((LightingSystem) systems.get("Lighting")).adjustLights();
                }
                break;
            default:
                System.out.println("центр керування: невідома подія - " + event);
        }
    }
}