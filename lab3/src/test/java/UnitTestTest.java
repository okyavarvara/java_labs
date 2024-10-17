import org.example.UnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTestTest {

    @Test
    public void testExecuteUnitTest() {
        UnitTest test = new UnitTest("юніт тест");
        assertDoesNotThrow(() -> test.execute());
        assertEquals("юніт тест", test.getTestName());
    }
}

