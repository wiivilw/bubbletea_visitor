package visitors;

import elements.Milk;
import elements.Tapioca;
import elements.TeaBase;
import elements.FruitJelly;

public interface IngredientVisitor {

    String visitMilk(Milk milk);

    String visitTapioca(Tapioca tapioca);

    String visitTeaBase(TeaBase tea);

    String visitFruitJelly(FruitJelly jelly);
}