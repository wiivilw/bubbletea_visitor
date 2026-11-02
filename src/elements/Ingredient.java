package elements;

import visitors.IngredientVisitor;

public interface Ingredient {
    String accept(IngredientVisitor visitor);
}