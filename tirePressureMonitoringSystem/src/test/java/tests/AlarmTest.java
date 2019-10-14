package tests;

import classes.Alarm;
import classes.SafetyRange;
import classes.Sensor;
import helpers.AlarmBuilder;
import org.junit.Test;

import static helpers.AlarmBuilder.anAlarm;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlarmTest {

    @Test
    public void alarmeSeDeclenche_EnCasDeValeurTropBasse() {
        Alarm alarm = anAlarm()
                        .usingSensor(0.0)
                        .withSafetyRange(17, 21)
                        .build();
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void alarmeSeDeclenche_EnCasDeValeurTropForte() {
        Alarm alarm = anAlarm()
                .usingSensor(30.0)
                .withSafetyRange(17, 21)
                .build();
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void alarmeNeSeDeclenchePas_SiValeurDansSeuilDeSecurite() {
        Alarm alarm = anAlarm()
                .usingSensor(20.0)
                .withSafetyRange(17, 21)
                .build();
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void uneFoisDeclenchee_alarmeResteDeclenchee_QuelleQueSoitLaValeur() {
        Alarm alarm = anAlarm()
                .usingSensor(30.0, 20.0)
                .withSafetyRange(17, 21)
                .build();

        alarm.check();
        assertTrue(alarm.isAlarmOn());

        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}