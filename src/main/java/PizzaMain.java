import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PizzaMain {

    public static void main(String[] args) {

        List<Ingredients> margaritaIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.POMIDOR);
        List<Ingredients> fungiIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.PIECZARKI, Ingredients.POMIDOR);
        List<Ingredients> salamiIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.SALAMI, Ingredients.POMIDOR);
        List<Ingredients> vegetarianaIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.PIECZARKI, Ingredients.POMIDOR,
                Ingredients.CEBULA, Ingredients.PAPRYKA, Ingredients.SELER);
        List<Ingredients> diavolaIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.SALAMI, Ingredients.POMIDOR,
                Ingredients.CEBULA, Ingredients.PAPRYKA);
        List<Ingredients> pepperoniIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.POMIDOR, Ingredients.CEBULA,
                Ingredients.PAPRYKA);
        List<Ingredients> marinaraIngredients = Arrays.asList(Ingredients.POMIDOR);
        List<Ingredients> primaveraIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.PIECZARKI, Ingredients.POMIDOR,
                Ingredients.CEBULA, Ingredients.PAPRYKA);
        List<Ingredients> selerianaIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.SELER, Ingredients.POMIDOR);
        List<Ingredients> cebulianaIngredients = Arrays.asList(Ingredients.MOZARELLA, Ingredients.CEBULA, Ingredients.POMIDOR);

        Pizza margarita = new Pizza(true, margaritaIngredients, 300, PizzaName.MARGARITA);
        Pizza fungi = new Pizza(true, fungiIngredients, 350, PizzaName.FUNGI);
        Pizza salami = new Pizza(false, salamiIngredients, 500, PizzaName.SALAMI);
        Pizza vegetariana = new Pizza(true, vegetarianaIngredients, 400, PizzaName.VEGETARIANA);
        Pizza diavola = new Pizza(false, diavolaIngredients, 600, PizzaName.DIAVOLA);
        Pizza pepperoni = new Pizza(true, pepperoniIngredients, 375, PizzaName.PEPPERONI);
        Pizza marinara = new Pizza(true, marinaraIngredients, 250, PizzaName.MARINARA);
        Pizza primavera = new Pizza(true, primaveraIngredients, 380, PizzaName.PRIMAVERA);
        Pizza seleriana = new Pizza(true, selerianaIngredients, 360, PizzaName.SELERIANA);
        Pizza cebuliana = new Pizza(true, cebulianaIngredients, 320, PizzaName.CEBULIANA);

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
                .filter((Pizza pizza) -> pizza.getIngredients().contains(Ingredients.SELER))
                .forEach((Pizza pizza) -> System.out.println(pizza.getName()));
    }

    public static boolean checkIfExistVeggiePizzaContainingPaprikaAndTomato(List<Pizza> menu) {
        return menu.stream().filter(Pizza::isVegetarian).anyMatch((Pizza pizza) ->
                pizza.getIngredients().contains(Ingredients.POMIDOR) && (pizza.getIngredients().contains(Ingredients.PAPRYKA)));
    }

    public static boolean checkIfAllPizzaContainsMozzarella(List<Pizza> menu) {
        return menu.stream().allMatch((Pizza pizza) -> pizza.getIngredients().contains(Ingredients.MOZARELLA));
    }

    public static Pizza getPizzaWithMostKcal(List<Pizza> menu) {
        return menu.stream().max(Comparator.comparing(Pizza::getKcal)).get();
    }

    public static Pizza getPizzaWithLessKcal(List<Pizza> menu) {
        return menu.stream().min(Comparator.comparing(Pizza::getKcal)).get();
    }


}
