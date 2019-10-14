package helpers;

import classes.PressureSensor;

public class SensorSimulation extends PressureSensor {

    private double premierePression;
    private double secondePression;
    private boolean isPremiereValeur;

    public SensorSimulation(double premierePression) {
        this.premierePression = premierePression;
        this.isPremiereValeur = true;
    }

    public SensorSimulation(double premierePression, double secondePression) {
        this.premierePression = premierePression;
        this.secondePression = secondePression;
        this.isPremiereValeur = true;
    }

    @Override
    public double probeValue() {
            if (isPremiereValeur) {
                isPremiereValeur = false;
                return premierePression;
            }
            return secondePression;
    }

}
