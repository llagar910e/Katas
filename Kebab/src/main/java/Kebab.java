import java.lang.reflect.Array;
import java.util.*;

public class Kebab {

    private ArrayList<String> ingredients;

    private final static List<String> vegetables = Arrays.asList("SALADE", "OIGNON", "TOMATE");
    private final static List<String> fromages = Arrays.asList("CHEDDAR", "EMMENTAL");
    private static final List<String> poissons = Arrays.asList("ANCHOIS", "SARDINE", "SAUMON", "CREVETTES");
    private static final List<String> viandes = Arrays.asList("BOEUF", "MOUTON", "DINDE");
    private final static List<String> complements = Arrays.asList("OEUF");


    public Kebab(){
    }

    public Kebab(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    }

    public boolean isVegetarien(){
        return !isWithMeat() && !isWithFish();
    }

    public boolean isPescarien(){
        return !isWithMeat();
    }

    public boolean isWithMeat(){
        for(String viande : viandes) {
            if (ingredients.contains(viande))
                return true;
        }
        return false;
    }

    public boolean isWithFish(){
        for(String poisson : poissons) {
            if (ingredients.contains(poisson))
                return true;
        }
        return false;
    }

    public void doubleCheese() {
        for(String fromage : fromages)
            if (ingredients.contains(fromage))
                ingredients.add(ingredients.indexOf(fromage), fromage);
    }


    public void removeOignons() {
        ingredients.removeAll(Arrays.asList("OIGNON"));
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }
}
