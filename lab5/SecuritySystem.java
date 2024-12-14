import java.util.List;
public class SecuritySystem implements CityComponent {
    private CityMediator mediator;

    public SecuritySystem(CityMediator mediator) {
        this.mediator = mediator;
    }

    public void activateEmergencyProtocol() {
        System.out.println("система безпеки: активація протоколу надзвичайної ситуації");
    }

    public void reportEmergency() {
        System.out.println("система безпеки: виявлено надзвичайну ситуацію");
        mediator.notify("EMERGENCY_ALERT", this);
    }

    @Override
    public void add(CityComponent component) {
        throw new UnsupportedOperationException("система безпеки не підтримує цю операцію");
    }

    @Override
    public void remove(CityComponent component) {
        throw new UnsupportedOperationException("система безпеки не підтримує цю операцію");
    }

    @Override
    public List<CityComponent> getChildren() {
        throw new UnsupportedOperationException("система безпеки не має вкладених компонентів");
    }

    @Override
    public String displayDetails() {
        return "система безпеки";
    }
}