import java.util.LinkedList;
import java.util.List;

public class Assiette implements Kebab {

    public List<Ingredient> getIngredients() {
        return new LinkedList<>();
    }

    public boolean isVegetarien() {
        return true;
    }

    public boolean isPescetarien() {
        return true;
    }

}