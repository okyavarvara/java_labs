import java.util.List;
public class Sensor implements CityComponent {
    private String name;

    public Sensor(String name) {
        this.name = name;
    }

    @Override
    public void add(CityComponent component) {
        throw new UnsupportedOperationException("датчики не підтримують вкладені елементи");
    }

    @Override
    public void remove(CityComponent component) {
        throw new UnsupportedOperationException("датчики не підтримують вкладені елементи");
    }

    @Override
    public List<CityComponent> getChildren() {
        throw new UnsupportedOperationException("датчики не підтримують вкладені елементи");
    }

    @Override
    public String displayDetails() {
        return "датчик: " + name;
    }
}