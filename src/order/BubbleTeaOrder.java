package order;

import elements.Ingredient;
import visitors.IngredientVisitor;

import java.util.ArrayList;
import java.util.List;

public class BubbleTeaOrder {

    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String accept(IngredientVisitor visitor) {

        StringBuilder result = new StringBuilder();

        for (Ingredient ingredient : ingredients) {
            result.append(ingredient.accept(visitor));
            result.append("\n");
        }

        return result.toString();
    }
}