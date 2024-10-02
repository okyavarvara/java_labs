package org.example;

public class Main {
    public static void main(String[] args) {
        Candy[] candies = {
                new ChocolateCandy("Milka", 50, 30, 70),
                new ChocolateCandy("Snickers", 60, 35, 80),
                new CaramelCandy("Toffee", 40, 25, 0),
                new FruitCandy("Jelly", 30, 20, 0)
        };

        Gift gift = new Gift();
        for (Candy candy : candies) {
            gift.addCandy(candy);
        }

        System.out.println("Всі цукерки в подарунці:");
        gift.displayCandies();

        System.out.println("Вага подарунку: " + gift.calculateTotalWeight());

        System.out.println("Цукерки, відсортовані за вагою:");
        gift.sortCandiesByWeight();
        gift.displayCandies();

        double minChocolate = 60;
        double maxChocolate = 80;
        Candy foundCandy = gift.findCandyByChocolateContent(minChocolate, maxChocolate);
        if (foundCandy != null) {
            System.out.println("Знайдено цукерку зі змістом шоколаду в цьому діапазоні:" + minChocolate + "% and " + maxChocolate + "%:");
            foundCandy.displayInfo();
        } else {
            System.out.println("У вказаному асортименті шоколаду не знайдено цукерок.");
        }
    }
}
