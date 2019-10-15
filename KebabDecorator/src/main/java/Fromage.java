public class Fromage extends Ingredient {

    public Fromage(String nom, Kebab kebab) {
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