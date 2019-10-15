import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KebabTest {

    private ArrayList<String> ingredients;
    private Kebab kebab;

    @Before
    public void before(){
        ingredients = new ArrayList<String>();
    }

    @Test
    public void faireKebabs(){
        kebab = new Kebab();
    }

    @Test
    public void isVegetarien(){
        ingredients.add("TOMATE");
        ingredients.add("OIGNON");
        ingredients.add("OEUF");
        ingredients.add("CHEDDAR");

        Kebab kebab = new Kebab(ingredients);

        boolean isVegetarien = kebab.isVegetarien();

        assertEquals(true, isVegetarien);
    }

    @Test
    public void isNotVegetarien(){
        ingredients.add("TOMATE");
        ingredients.add("OIGNON");
        ingredients.add("OEUF");
        ingredients.add("CHEDDAR");
        ingredients.add("BOEUF");

        Kebab kebab = new Kebab(ingredients);

        boolean isVegetarien = kebab.isVegetarien();

        assertEquals(false, isVegetarien);
    }

    @Test
    public void isPescarien(){
        ingredients.add("TOMATE");
        ingredients.add("OIGNON");
        ingredients.add("OEUF");
        ingredients.add("CHEDDAR");
        ingredients.add("ANCHOIS");

        Kebab kebab = new Kebab(ingredients);

        boolean isPescarien = kebab.isPescarien();

        assertEquals(true, isPescarien);
    }

    @Test
    public void isNotPescarien(){
        ingredients.add("TOMATE");
        ingredients.add("OIGNON");
        ingredients.add("OEUF");
        ingredients.add("CHEDDAR");
        ingredients.add("ANCHOIS");
        ingredients.add("BOEUF");

        Kebab kebab = new Kebab(ingredients);

        boolean isPescarien = kebab.isPescarien();

        assertEquals(false, isPescarien);
    }

    @Test
    public void doublerFromage(){
        ingredients.add("TOMATE");
        ingredients.add("CHEDDAR");
        ingredients.add("ANCHOIS");
        ingredients.add("EMMENTAL");
        ingredients.add("BOEUF");

        List<String> expectedIngredients = Arrays.asList("TOMATE, CHEDDAR, CHEDDAR, ANCHOIS, EMMENTAL, EMMENTAL, BOEUF");

        Kebab kebab = new Kebab(ingredients);
        kebab.doubleCheese();

        assertEquals(expectedIngredients.toString(), kebab.getIngredients().toString());
    }

    @Test
    public void enleverOignons(){
        ingredients.add("TOMATE");
        ingredients.add("OIGNON");
        ingredients.add("OEUF");
        ingredients.add("CHEDDAR");
        ingredients.add("OIGNON");
        ingredients.add("ANCHOIS");
        ingredients.add("BOEUF");

        List<String> expectedIngredients = Arrays.asList("TOMATE", "OEUF", "CHEDDAR", "ANCHOIS", "BOEUF");

        Kebab kebab = new Kebab(ingredients);
        kebab.removeOignons();

        assertEquals(expectedIngredients.toString(), kebab.getIngredients().toString());
    }
}
