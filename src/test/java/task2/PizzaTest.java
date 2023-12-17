package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

public class PizzaTest {
    private List<Pizza> menu;

    @BeforeEach
    public void setUp() {
        menu = PizzaMenu.createMenu();
    }

    @Test
    public void testVegetarianPizzas() {

        // When
        List<String> vegetarianPizzas = Pizza.getVegetarianPizzas(menu);

        // Then
        assertNotNull(vegetarianPizzas);
        assertEquals(5, vegetarianPizzas.size());
        assertTrue(vegetarianPizzas.contains("Vegetariana"));
        assertTrue(vegetarianPizzas.contains("Margarita"));
        assertTrue(vegetarianPizzas.contains("Vegetariana Funghi"));
        assertTrue(vegetarianPizzas.contains("Vegetariana Deluxe"));
        assertTrue(vegetarianPizzas.contains("Vegetariana Seleriana"));
    }

    @Test
    public void testContainsCelery() {

        // When
        List<String> pizzasWithCelery = Pizza.getPizzasWithCelery(menu);

        // Then
        assertNotNull(pizzasWithCelery);
        assertEquals(3, pizzasWithCelery.size());
        assertTrue(pizzasWithCelery.contains("Vegetariana Deluxe"));
        assertTrue(pizzasWithCelery.contains("Szynka Special"));
        assertTrue(pizzasWithCelery.contains("Vegetariana Seleriana"));
    }


    @Test
    public void testVegeContainsTomatoAndPepper() {

        // When
        boolean hasPizza = Pizza.hasVegetarianPizzaWithTomatoAndPepper(menu);

        // Then
        assertTrue(hasPizza);
    }

    @Test
    public void testContainsMozzarella() {

        // When
        boolean allContainMozzarella = Pizza.allPizzasContainMozzarella(menu);

        // Then
        assertTrue(allContainMozzarella);
    }

    @Test
    public void testMaxCalories() {

        // When
        Pizza pizzaWithMaxCalories = Pizza.getPizzaWithMaxCalories(menu);

        // Then
        assertNotNull(pizzaWithMaxCalories);
        assertEquals("Szynka Special", pizzaWithMaxCalories.getName());
    }

    @Test
    public void testMinCalories() {

        // When
        Pizza pizzaWithMinCalories = Pizza.getPizzaWithMinCalories(menu);

        // Then
        assertNotNull(pizzaWithMinCalories);
        assertEquals("Vegetariana Funghi", pizzaWithMinCalories.getName());
    }
}