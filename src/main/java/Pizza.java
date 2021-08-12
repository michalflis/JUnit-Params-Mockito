import java.util.List;

public class Pizza {

    private boolean isVegetarian;
    private List<Ingredients> ingredients;
    private int kcal;
    private PizzaName name;

    public Pizza(boolean isVegetarian, List<Ingredients> ingredients, int kcal, PizzaName name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.kcal = kcal;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public PizzaName getName() {
        return name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getKcal() {
        return kcal;
    }

}
