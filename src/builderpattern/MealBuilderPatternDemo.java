package builderpattern;

public class MealBuilderPatternDemo {
    public void execute(){
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

    }
}
