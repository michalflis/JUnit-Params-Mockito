import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PizzaMain {

    public static void main(String[] args) {

        List<String> margaritaIngredients = Arrays.asList("mozzarella", "pomidor");
        List<String> fungiIngredients = Arrays.asList("mozzarella", "pieczarki", "pomidor");
        List<String> salamiIngredients = Arrays.asList("mozzarella", "salami", "pomidor");
        List<String> vegetarianaIngredients = Arrays.asList("mozzarella", "pieczarki", "pomidor", "cebula", "papryka", "seler");
        List<String> diavolaIngredients = Arrays.asList("mozzarella", "salami", "pomidor", "cebula", "papryka");
        List<String> pepperoniIngredients = Arrays.asList("mozzarella", "pomidor", "cebula", "papryka");
        List<String> marinaraIngredients = Arrays.asList("pomidor");
        List<String> primaveraIngredients = Arrays.asList("mozzarella", "pieczarki", "pomidor", "cebula", "papryka");
        List<String> selerianaIngredients = Arrays.asList("mozzarella", "seler", "pomidor");
        List<String> cebulianaIngredients = Arrays.asList("mozzarella", "cebula", "pomidor");

        Pizza margarita = new Pizza(true, margaritaIngredients, 300, "Margarita");
        Pizza fungi = new Pizza(true, fungiIngredients, 350, "Fungi");
        Pizza salami = new Pizza(false, salamiIngredients, 500, "Salami");
        Pizza vegetariana = new Pizza(true, vegetarianaIngredients, 400, "Vegetriana");
        Pizza diavola = new Pizza(false, diavolaIngredients, 600, "Diavola");
        Pizza pepperoni = new Pizza(true, pepperoniIngredients, 375, "Pepperoni");
        Pizza marinara = new Pizza(true, marinaraIngredients, 250, "Marinara");
        Pizza primavera = new Pizza(true, primaveraIngredients, 380, "Primavera");
        Pizza seleriana = new Pizza(true, selerianaIngredients, 360, "Seleriana");
        Pizza cebuliana = new Pizza(true, cebulianaIngredients, 320, "Cebuliana");

        List<Pizza> menu = List.of(margarita, fungi, salami, vegetariana, diavola, pepperoni, marinara, primavera, seleriana, cebuliana);

        printVeggiePizzas(menu);
        printPizzasWithSeler(menu);
        System.out.println(checkIfExistVeggiePizzaContainingPaprikaAndTomato(menu));
        System.out.println(checkIfAllPizzaContainsMozzarella(menu));
        System.out.println(getPizzaWithMostKcal(menu).getName());
        System.out.println(getPizzaWithLessKcal(menu).getName());
    }

    public static void printVeggiePizzas(List<Pizza> menu) {
        menu.stream()
                .filter(Pizza::isVegetarian)
                .forEach((Pizza pizza) -> System.out.println(pizza.getName()));
    }

    public static void printPizzasWithSeler(List<Pizza> menu) {
        menu.stream()
                .filter((Pizza pizza) -> pizza.getIngredients().contains("seler"))
                .forEach((Pizza pizza) -> System.out.println(pizza.getName()));
    }

    public static boolean checkIfExistVeggiePizzaContainingPaprikaAndTomato(List<Pizza> menu) {
        return menu.stream().filter(Pizza::isVegetarian).anyMatch((Pizza pizza) ->
                pizza.getIngredients().contains("pomidor") && (pizza.getIngredients().contains("papryka")));
    }

    public static boolean checkIfAllPizzaContainsMozzarella(List<Pizza> menu) {
        return menu.stream().allMatch((Pizza pizza) -> pizza.getIngredients().contains("mozarella"));
    }

    public static Pizza getPizzaWithMostKcal(List<Pizza> menu) {
        return menu.stream().max(Comparator.comparing(Pizza::getKcal)).get();
    }

    public static Pizza getPizzaWithLessKcal(List<Pizza> menu) {
        return menu.stream().min(Comparator.comparing(Pizza::getKcal)).get();
    }


}
