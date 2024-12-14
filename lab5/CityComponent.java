import java.util.List;

public interface CityComponent {
    void add(CityComponent component);
    void remove(CityComponent component);
    List<CityComponent> getChildren();
    String displayDetails();
}