package classes;

public class Alarm {

    private Sensor sensor;
    private boolean alarmOn;
    private SafetyRange safetyRange;


    public Alarm(Sensor sensor, SafetyRange safetyrange) {
        this.alarmOn = false;
        this.sensor = sensor;
        this.safetyRange = safetyrange;
    }

    public void check() {
        double value = probeValue();

        if (isNotSafe(value)) {
            activateAlarm();
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }

    private double probeValue() {
        return sensor.probeValue();
    }

    private void activateAlarm() {
        alarmOn = true;
    }

    private boolean isNotSafe(double value) {
        return !safetyRange.contains(value);
    }

}