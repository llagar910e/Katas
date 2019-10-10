public class Main {

   public static void main(String [] args){

        NombresRomains nombreRomain = new NombresRomains();
        int nombre = (int)(Math.random() * ((1000 - 1) + 1)) + 1;

        System.out.println(nombre);


        nombreRomain.convertirMille(nombre/1000%10);

        nombreRomain.convertirCinqCentNeufCent(nombre/100%10);
        nombreRomain.convertirCentQuantreCent(nombre/100%10);

        nombreRomain.convertirCinquanteQuatreVingtDix(nombre/10%10);
        nombreRomain.convertirDixQuarante(nombre/10%10);

        nombreRomain.convertirCinqNeuf(nombre%10);
        nombreRomain.convertirUnQuatre(nombre%10);

        nombreRomain.afficher();
    }

}
