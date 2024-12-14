import java.util.List;

public class TransportationSystem implements CityComponent {
    private CityMediator mediator;

    public TransportationSystem(CityMediator mediator) {
        this.mediator = mediator;
    }

    public void reportCongestion() {
        System.out.println("система дорожнього руху: виявлено затор");
        mediator.notify("TRAFFIC_CONGESTION", this);
    }

    @Override
    public void add(CityComponent component) {
        throw new UnsupportedOperationException("система дорожнього руху не підтримує додавання");
    }

    @Override
    public void remove(CityComponent component) {
        throw new UnsupportedOperationException("система дорожнього руху не підтримує видалення");
    }

    @Override
    public List<CityComponent> getChildren() {
        throw new UnsupportedOperationException("система дорожнього руху не має вкладених елементів");
    }

    @Override
    public String displayDetails() {
        return "система дорожнього руху";
    }
}