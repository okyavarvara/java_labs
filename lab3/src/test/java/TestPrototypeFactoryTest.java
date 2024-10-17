import org.example.TestPrototype;
import org.example.TestPrototypeFactory;
import org.example.UnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrototypeFactoryTest {

    @Test
    public void testRegisterAndCreatePrototype() {
        TestPrototypeFactory factory = new TestPrototypeFactory();

        factory.registerPrototype("unit", new UnitTest("Sample Unit Test"));

        TestPrototype test = factory.createTest("unit");

        assertTrue(test instanceof UnitTest);

        assertEquals("Sample Unit Test", ((UnitTest) test).getTestName());
    }

    @Test
    public void testUnknownPrototype() {
        TestPrototypeFactory factory = new TestPrototypeFactory();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createTest("unknown");
        });
        assertEquals("такого типу тесту не знайдено", exception.getMessage());
    }
}