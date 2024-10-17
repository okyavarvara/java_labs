package org.example;
import java.util.HashMap;
import java.util.Map;

public class TestPrototypeFactory {
    private Map<String, TestPrototype> prototypes = new HashMap<>();

    public void registerPrototype(String key, TestPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public TestPrototype createTest(String key) {
        TestPrototype prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.cloneTest();
        }
        throw new IllegalArgumentException("такого типу тесту не знайдено");
    }
}