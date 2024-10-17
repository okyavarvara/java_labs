package org.example;

public class UnitTest implements TestPrototype {
    private String testName;

    public UnitTest(String testName) {
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    @Override
    public UnitTest cloneTest() {
        return new UnitTest(this.testName);
    }

    @Override
    public void execute() {
        System.out.println("Виконання юніт тесту: " + testName);
    }
}
