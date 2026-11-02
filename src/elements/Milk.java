package elements;

import visitors.IngredientVisitor;

public class Milk implements Ingredient {

    private double amount;
    private double calories;
    private double cost;

    public Milk(double amount, double calories, double cost) {
        this.amount = amount;
        this.calories = calories;
        this.cost = cost;
    }

    public double getAmount() {
        return amount;
    }

    public double getCalories() {
        return calories;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String accept(IngredientVisitor visitor) {
        return visitor.visitMilk(this);
    }
}