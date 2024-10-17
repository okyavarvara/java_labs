package org.example;

public class IntegrationTest implements TestPrototype {
    private String testName;

    public IntegrationTest(String testName) {
        this.testName = testName;
    }

    @Override
    public IntegrationTest cloneTest() {
        return new IntegrationTest(this.testName);
    }

    @Override
    public void execute() {
        System.out.println("Виконання інтеграційного тесту: " + testName);
    }
}
