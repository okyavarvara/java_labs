import java.util.List;

public class LightingSystem implements CityComponent {
    private CityMediator mediator;

    public LightingSystem(CityMediator mediator) {
        this.mediator = mediator;
    }

    public void adjustLights() {
        System.out.println("система освітлення: регулювання освітлення.");
        mediator.notify("LIGHT_ON", this);
    }

    @Override
    public void add(CityComponent component) {
        throw new UnsupportedOperationException("система освітлення не підтримує додавання.");
    }

    @Override
    public void remove(CityComponent component) {
        throw new UnsupportedOperationException("система освітлення не підтримує видалення.");
    }

    @Override
    public List<CityComponent> getChildren() {
        throw new UnsupportedOperationException("система освітлення не має вкладених елементів.");
    }

    @Override
    public String displayDetails() {
        return "система освітлення";
    }
}