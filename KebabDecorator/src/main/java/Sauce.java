public class Sauce extends Ingredient {

    public Sauce(String nom, Kebab kebab) {
        super(nom, kebab);
    }

    @Override
    public boolean isVegetarien() {
        return super.isVegetarien();
    }

    @Override
    public boolean isPescetarien() {
        return super.isPescetarien();
    }

}