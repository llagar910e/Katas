public class Thon extends Ingredient {

    public Thon(String nom, Kebab kebab) {
        super(nom, kebab);

    }

    @Override
    public boolean isVegetarien() {
        return false;
    }

    @Override
    public boolean isPescetarien() {
        return super.isPescetarien();
    }

}