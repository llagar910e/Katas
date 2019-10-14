package classes;

import java.util.Random;

public class PressureSensor implements Sensor{
    private static final double OFFSET = 16;
    private static  final Random basicRandomNumbersGenerator = new Random();

   @Override
    public double probeValue() {
        double pressureTelemetryValue;
        pressureTelemetryValue = samplePressure( );

        return OFFSET + pressureTelemetryValue;
    }

    private static double samplePressure() {
        double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
        return pressureTelemetryValue;
    }
}