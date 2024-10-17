package org.example;

public class UITest implements TestPrototype {
    private String testName;

    public UITest(String testName) {
        this.testName = testName;
    }

    @Override
    public UITest cloneTest() {
        return new UITest(this.testName);
    }

    @Override
    public void execute() {
        System.out.println("Виконання UI тесту: " + testName);
    }
}
