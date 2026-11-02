package visitors;

import elements.Milk;
import elements.Tapioca;
import elements.TeaBase;
import elements.FruitJelly;

public class CostVisitor implements IngredientVisitor {

    private double totalCost = 0;

    @Override
    public String visitMilk(Milk milk) {
        totalCost += milk.getCost();
        return "Milk: " + milk.getCost() + " KZT";
    }

    @Override
    public String visitTapioca(Tapioca tapioca) {
        totalCost += tapioca.getCost();
        return "Tapioca: " + tapioca.getCost() + " KZT";
    }

    @Override
    public String visitTeaBase(TeaBase tea) {
        totalCost += tea.getCost();
        return "Tea Base: " + tea.getCost() + " KZT";
    }

    @Override
    public String visitFruitJelly(FruitJelly jelly) {
        totalCost += jelly.getCost();
        return "Fruit Jelly: " + jelly.getCost() + " KZT";
    }

    public double getTotalCost() {
        return totalCost;
    }
}