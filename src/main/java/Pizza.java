import java.util.List;

public class Pizza {

    private boolean isVegetarian;
    private List<String> ingredients;
    private int kcal;
    private String name;

    public Pizza(boolean isVegetarian, List<String> ingredients, int kcal, String name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.kcal = kcal;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getKcal() {
        return kcal;
    }


}
