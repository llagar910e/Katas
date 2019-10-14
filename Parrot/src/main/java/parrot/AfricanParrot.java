package parrot;

public class AfricanParrot extends Parrot {

    private int numberOfCoconuts;
    private static final double LOADFACTOR = 9.0;

    public AfricanParrot(int numberOfCoconuts){
        this.numberOfCoconuts = numberOfCoconuts;
    }


    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - LOADFACTOR * this.numberOfCoconuts);
    }
}
