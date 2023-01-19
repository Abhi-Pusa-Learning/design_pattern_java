package builderpattern;

import builderpattern.item.Item;
import builderpattern.item.berger.NonVegBerger;
import builderpattern.item.berger.VegBerger;
import builderpattern.item.colddrinks.CocaCola;
import builderpattern.item.colddrinks.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal(){
       Meal vegMeal = new Meal();
       Item vegBerger = new VegBerger();
       Item pepsi = new Pepsi();
       vegMeal.addItem(vegBerger);
       vegMeal.addItem(pepsi);
       return vegMeal;
    }

    public Meal prepareNonVegMeal(){
        Meal nonVegMeal = new Meal();
        Item nonVegBerger = new NonVegBerger();
        Item coke = new CocaCola();
        nonVegMeal.addItem(nonVegBerger);
        nonVegMeal.addItem(coke);
        return nonVegMeal;
    }
}
