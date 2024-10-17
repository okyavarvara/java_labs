import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSystemIntegrationTest {

    @Test
    public void testSystem() {
        TestPrototypeFactory factory = new TestPrototypeFactory();
        factory.registerPrototype("unit", new UnitTest("юніт тест"));
        factory.registerPrototype("integration", new IntegrationTest("інтеграційний тест"));

        factory.registerPrototype("ui", new UITest("UI тест"));
        assertDoesNotThrow(() -> {
            TestPrototype unitTest = factory.createTest("unit");
            unitTest.execute();

            TestPrototype integrationTest = factory.createTest("integration");
            integrationTest.execute();

            TestPrototype uiTest = factory.createTest("ui");
            uiTest.execute();
        });
    }
}
