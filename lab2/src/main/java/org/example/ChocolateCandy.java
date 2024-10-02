package org.example;

public class ChocolateCandy extends Candy {
    public ChocolateCandy(String name, double weight, double sugarContent, double chocolateContent){
        super(name, weight, sugarContent, chocolateContent);
    }

    @Override
    public void displayInfo() {
        System.out.printf(
                "Шоколадна цукерка: %s\nВага: %.2f г\nЦукор: %.2f%%\nШоколад: %.2f%%\n",
                getName(), getWeight(), getSugarContent(), getChocolateContent()
        );
    }
}
