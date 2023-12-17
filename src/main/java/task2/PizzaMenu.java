package task2;

import java.util.Arrays;
import java.util.List;

public class PizzaMenu {

    public static List<Pizza> createMenu() {
        return Arrays.asList(
                new Pizza(true, Arrays.asList("mozarella", "pieczarki", "pomidor"), 500, "Vegetariana"),
                new Pizza(false, Arrays.asList("mozarella", "kiełbasa", "cebula"), 700, "Cebula Mayhem"),
                new Pizza(true, Arrays.asList("mozarella", "pomidor", "papryka"), 550, "Margarita"),
                new Pizza(false, Arrays.asList("mozarella", "szynka", "papryka"), 600, "Paprika"),
                new Pizza(true, Arrays.asList("mozarella", "pieczarki", "cebula"), 480, "Vegetariana Funghi"),
                new Pizza(false, Arrays.asList("mozarella", "kiełbasa", "pomidor"), 650, "Pomodoro"),
                new Pizza(true, Arrays.asList("mozarella", "pomidor", "papryka", "seler"), 600, "Vegetariana Deluxe"),
                new Pizza(false, Arrays.asList("mozarella", "szynka", "papryka", "seler"), 750, "Szynka Special"),
                new Pizza(true, Arrays.asList("mozarella", "pomidor", "seler"), 520, "Vegetariana Seleriana"),
                new Pizza(false, Arrays.asList("mozarella", "kiełbasa", "cebula", "papryka"), 680, "Kiełba Deluxe")
        );
    }
}