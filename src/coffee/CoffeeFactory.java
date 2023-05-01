package coffee;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeFactory {

    public static enum Type {
        LONG_BLACK( 4.0,
                new Ingredient[] {Ingredient.ESPRESSO, Ingredient.ESPRESSO}),
        FLAT_WHITE(4.75,
                new Ingredient[] {Ingredient.ESPRESSO, Ingredient.MILK}),
        MOCHA(5.5,
                new Ingredient[] {Ingredient.ESPRESSO, Ingredient.MILK, Ingredient.CHOCOLATE});

        private double price;
        private ArrayList<Ingredient> ingredients;

        Type(double price, Ingredient[] ingredients) {

            this.price = price;
            this.ingredients = new ArrayList<Ingredient>(Arrays.asList(ingredients));
        }

        public double getPrice() {
            return price;
        }

        public ArrayList<Ingredient> getIngredients() {
            return ingredients;
        }
    }

    public static enum Ingredient {
        ESPRESSO(0.5),
        MILK(1),
        CHOCOLATE(1.5);

        private double cost;

        Ingredient(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    public static Coffee createCoffee(Type type){
        Coffee coffee = new Coffee(type.getIngredients(), type);
        return coffee;
    }

    public static void main(String[] args) {
        Coffee flatWhite = CoffeeFactory.createCoffee(Type.FLAT_WHITE);
        Coffee longBlack = CoffeeFactory.createCoffee(Type.LONG_BLACK);
        Coffee mocha = CoffeeFactory.createCoffee(Type.MOCHA);

        System.out.printf("Flat white costs $%.2f in ingredient and is sold for $%.2f\n", flatWhite.getCost(), flatWhite.getPrice());
        System.out.printf("Long Black costs $%.2f in ingredient and is sold for $%.2f\n", longBlack.getCost(), longBlack.getPrice());
        System.out.printf("Mocha costs $%.2f in ingredient and is sold for $%.2f\n", mocha.getCost(), mocha.getPrice());

    }
}


