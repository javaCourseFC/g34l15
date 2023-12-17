package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Pizza {
    private boolean isVegetarian;
    private List<String> ingredients;
    private int calories;
    private String name;

    public Pizza(boolean isVegetarian, List<String> ingredients, int calories, String name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }


    public static List<String> getVegetarianPizzas(List<Pizza> menu) {
        return menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .collect(Collectors.toList());
    }


    public static List<String> getPizzasWithCelery(List<Pizza> menu) {
        return menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .collect(Collectors.toList());
    }


    public static boolean hasVegetarianPizzaWithTomatoAndPepper(List<Pizza> menu) {
        return menu.stream()
                .anyMatch(pizza -> pizza.isVegetarian() && pizza.getIngredients().containsAll(Arrays.asList("pomidor", "papryka")));
    }


    public static boolean allPizzasContainMozzarella(List<Pizza> menu) {
        return menu.stream()
                .allMatch(pizza -> pizza.getIngredients().contains("mozarella"));
    }


    public static Pizza getPizzaWithMaxCalories(List<Pizza> menu) {
        return menu.stream()
                .max((pizza1, pizza2) -> Integer.compare(pizza1.getCalories(), pizza2.getCalories()))
                .orElse(null);
    }


    public static Pizza getPizzaWithMinCalories(List<Pizza> menu) {
        return menu.stream()
                .min((pizza1, pizza2) -> Integer.compare(pizza1.getCalories(), pizza2.getCalories()))
                .orElse(null);
    }
}