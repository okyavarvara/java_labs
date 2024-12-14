import java.util.ArrayList;
import java.util.List;

public class Building implements CityComponent {
    private String name;
    private List<CityComponent> children = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    @Override
    public void add(CityComponent component) {
        children.add(component);
    }

    @Override
    public void remove(CityComponent component) {
        children.remove(component);
    }

    @Override
    public List<CityComponent> getChildren() {
        return children;
    }

    @Override
    public String displayDetails() {
        StringBuilder details = new StringBuilder("будівля: " + name + "\n");
        for (CityComponent child : children) {
            details.append("    ").append(child.displayDetails());
        }
        return details.toString();
    }
}
