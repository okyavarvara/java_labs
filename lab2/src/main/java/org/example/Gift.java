package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gift {
    private List<Candy> candies;

    public Gift() {
        candies = new ArrayList<>();
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public double calculateTotalWeight() {
        return candies.stream()
                .mapToDouble(Candy::getWeight)
                .sum();
    }

    public void sortCandiesByWeight() {
        candies.sort(Comparator.comparingDouble(Candy::getWeight));
    }

    public Candy findCandyByChocolateContent(double minChocolate, double maxChocolate) {
        for (Candy candy : candies) {
            double chocolateContent = candy.getChocolateContent();
            if (chocolateContent >= minChocolate && chocolateContent <= maxChocolate) {
                return candy;
            }
        }
        return null;
    }

    public void displayCandies() {
        for (Candy candy : candies) {
            candy.displayInfo();
        }
    }
}