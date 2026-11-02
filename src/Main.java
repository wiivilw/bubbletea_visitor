import elements.*;
import visitors.*;
import order.BubbleTeaOrder;

public class Main {

    public static void main(String[] args) {

        // Create ingredients
        Milk milk = new Milk(100, 120, 200);
        Tapioca tapioca = new Tapioca(50, 150, 300);
        TeaBase tea = new TeaBase(200, 10, 150);
        FruitJelly jelly = new FruitJelly(40, 80, 250);

        // Create a Bubble Tea order
        BubbleTeaOrder order = new BubbleTeaOrder();

        order.addIngredient(milk);
        order.addIngredient(tapioca);
        order.addIngredient(tea);
        order.addIngredient(jelly);

        // Create Nutrition Visitor
        NutritionVisitor nutritionVisitor = new NutritionVisitor();

        System.out.println("========== NUTRITION REPORT ==========");
        System.out.println(order.accept(nutritionVisitor));
        System.out.println("Total Calories: "
                + nutritionVisitor.getTotalCalories() + " kcal");

        // Create Cost Visitor
        CostVisitor costVisitor = new CostVisitor();

        System.out.println("\n========== COST REPORT ===============");
        System.out.println(order.accept(costVisitor));
        System.out.println("Total Cost: "
                + costVisitor.getTotalCost() + " KZT");
    }
}