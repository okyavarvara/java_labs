public class SmartCityDemo {
    public static void main(String[] ards){
        CityComponent district = new District("центральний район");
        CityComponent building = new Building("будівля А");
        CityComponent sensor = new Sensor("датчик температури");

        district.add(building);
        building.add(sensor);

        System.out.println("ієрархія міських об'єктів:");
        System.out.println(district.displayDetails());

        CityMediator cityMediator = new CityControlCenter();
        TransportationSystem transportation = new TransportationSystem(cityMediator);
        LightingSystem lighting = new LightingSystem(cityMediator);
        SecuritySystem security = new SecuritySystem(cityMediator);

        ((CityControlCenter) cityMediator).registerSystem("Transport", transportation);
        ((CityControlCenter) cityMediator).registerSystem("Lighting", lighting);
        ((CityControlCenter) cityMediator).registerSystem("Security", security);

        System.out.println("робота систем через медіатор:");
        transportation.reportCongestion();
        lighting.adjustLights();
        security.reportEmergency();
    }
}
