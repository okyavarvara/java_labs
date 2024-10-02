package org.example;

public class FruitCandy extends Candy {
    public FruitCandy(String name, double weight, double sugarContent, double chocolateContent) {
        super(name, weight, sugarContent, chocolateContent); // chocolateContent може бути 0
    }

    @Override
    public void displayInfo() {
        System.out.printf(
                "Фруктова цукерка: %s\nВага: %.2f г\nЦукор: %.2f%%\nШоколад: %.2f%%\n",
                getName(), getWeight(), getSugarContent(), getChocolateContent()
        );
    }
}