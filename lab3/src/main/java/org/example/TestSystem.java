package org.example;

public class TestSystem {
    public static void main(String[] args) {
        TestPrototypeFactory factory = new TestPrototypeFactory();

        factory.registerPrototype("unit", new UnitTest("юніт тест"));
        factory.registerPrototype("integration", new IntegrationTest("інеграційний тест"));
        factory.registerPrototype("ui", new UITest("Ui тест"));

        TestPrototype unitTest = factory.createTest("unit");
        unitTest.execute();

        TestPrototype integrationTest = factory.createTest("integration");
        integrationTest.execute();

        TestPrototype uiTest = factory.createTest("ui");
        uiTest.execute();
    }
}
