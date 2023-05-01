package coffee;

import java.util.ArrayList;
import coffee.CoffeeFactory.Ingredient;
import coffee.CoffeeFactory.Type;

public class Coffee {
    Type type;
    double cost;
    ArrayList<Ingredient> ingredients;

    public Coffee(ArrayList<Ingredient> ingredients, Type type) {
        this.type = type;

        this.ingredients = ingredients;

        double sum = 0;
        for (Ingredient ingredient : ingredients) {
            sum += ingredient.getCost();
        }
        this.cost = sum;

    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return type.getPrice();
    }

    public String listIngredients() {
        StringBuilder string = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            string.append(ingredient.toString());
            string.append("\n");
        }
        return string.toString();
    }
}