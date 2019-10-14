package helpers;
import classes.Alarm;
import classes.SafetyRange;
import classes.Sensor;

public class AlarmBuilder  {

    private Sensor sensor;
    private SafetyRange safetyRange;


    public static AlarmBuilder anAlarm(){
        return new AlarmBuilder();
    }

    public AlarmBuilder withSafetyRange(double min, double max){
        SafetyRange safetyRange = new SafetyRange(min, max);
        this.safetyRange = safetyRange;
        return this;
    }

    public AlarmBuilder usingSensor(Sensor sensor){
        this.sensor = sensor;
        return this;
    }

    public AlarmBuilder usingSensor(double pression){
        this.sensor = new SensorSimulation(pression);
        return this;
    }

    public AlarmBuilder usingSensor(double premierePression, double secondePression){
        this.sensor = new SensorSimulation(premierePression, secondePression);
        return this;
    }

    public Alarm build(){
        return new Alarm(this.sensor, this.safetyRange);
    }
}
