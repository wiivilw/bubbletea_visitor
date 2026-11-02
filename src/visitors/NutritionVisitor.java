package visitors;

import elements.Milk;
import elements.Tapioca;
import elements.TeaBase;
import elements.FruitJelly;

public class NutritionVisitor implements IngredientVisitor {

    private double totalCalories = 0;

    @Override
    public String visitMilk(Milk milk) {
        totalCalories += milk.getCalories();
        return "Milk: " + milk.getCalories() + " kcal";
    }

    @Override
    public String visitTapioca(Tapioca tapioca) {
        totalCalories += tapioca.getCalories();
        return "Tapioca: " + tapioca.getCalories() + " kcal";
    }

    @Override
    public String visitTeaBase(TeaBase tea) {
        totalCalories += tea.getCalories();
        return "Tea Base: " + tea.getCalories() + " kcal";
    }

    @Override
    public String visitFruitJelly(FruitJelly jelly) {
        totalCalories += jelly.getCalories();
        return "Fruit Jelly: " + jelly.getCalories() + " kcal";
    }

    public double getTotalCalories() {
        return totalCalories;
    }
}