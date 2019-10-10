public class NombresRomains {

    private final char MILLE = 'M';
    private final char CINQCENT = 'D';
    private final char CENT = 'C';
    private final char CINQUANTE = 'L';
    private final char DIX = 'X';
    private final char CINQ = 'V';
    private final char UN = 'I';


    private String valeur = "";


    public void convertirUnQuatre(int nombre){
        if (nombre == 4) setValeur(getValeur() + "IV");
        else if (nombre < 4) {
            for (int i = 0; i < nombre ; i++)setValeur(getValeur() + 'I');
        }
    }

    public void convertirCinqNeuf(int nombre){
        if (nombre == 9) setValeur(getValeur() + "IX");
        else if (nombre >=  5) {
            setValeur(getValeur() + 'V');
            for (int i = 5; i < nombre ; i++) setValeur(getValeur() + 'I');
        }
    }

    public void convertirDixQuarante(int nombre){
        if (nombre == 4) setValeur(getValeur() + "XL");
        else if (nombre < 4) for (int i = 0; i < nombre ; i++) setValeur(getValeur() + 'X');
    }

    public void convertirCinquanteQuatreVingtDix(int nombre){
        if (nombre == 9) setValeur(getValeur() + "XC");
        else if (nombre  >= 5) {
            setValeur(getValeur() + 'L');
            for (int i = 5; i < nombre ; i++) setValeur(getValeur() + 'X');
        }
    }

    public void convertirCentQuantreCent(int nombre){
        if (nombre == 4) setValeur(getValeur() + "CD");
        else if (nombre < 4) for (int i = 0; i < nombre ; i++)setValeur(getValeur() + 'C');
    }
    public void convertirCinqCentNeufCent(int nombre){
        if (nombre == 9)setValeur(getValeur() + "CM");
        else if (nombre >= 5) {
            setValeur(getValeur() + 'D');
            for (int i = 5; i < nombre ; i++) setValeur(getValeur() + 'C');
        }
    }

    public void convertirMille(int nombre){
        for (int i = 0; i < nombre ; i++)setValeur(getValeur() + 'M');
    }

    public String getValeur(){
        return this.valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public void afficher(){
        System.out.println(getValeur());
    }
}
