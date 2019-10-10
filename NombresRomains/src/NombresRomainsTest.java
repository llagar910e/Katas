import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NombresRomainsTest {

    NombresRomains nombreRomain;

    @Before
    public void setUp() throws Exception {
        nombreRomain = new NombresRomains();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNombreDeux(){
        nombreRomain.convertirUnQuatre(2);
       assertEquals("II", nombreRomain.getValeur());
    }

    @Test
    public void testNombreQuatre(){
        nombreRomain.convertirUnQuatre(4);
        assertEquals("IV", nombreRomain.getValeur());
    }

    @Test
    public void testNombreCinq(){
        nombreRomain.convertirCinqNeuf(5);
        assertEquals("V", nombreRomain.getValeur());
    }

    @Test
    public void testNombreSept(){
        nombreRomain.convertirCinqNeuf(7);
        assertEquals("VII", nombreRomain.getValeur());
    }

    @Test
    public void testNombreNeuf(){
        nombreRomain.convertirCinqNeuf(9);
        assertEquals("IX", nombreRomain.getValeur());
    }

    @Test
    public void testNombreDix(){
        nombreRomain.convertirDixQuarante(1);
        assertEquals("X", nombreRomain.getValeur());
    }

    @Test
    public void testNombreVingt(){
        nombreRomain.convertirDixQuarante(2);
        assertEquals("XX", nombreRomain.getValeur());
    }

    @Test
    public void testNombreQuarante(){
        nombreRomain.convertirDixQuarante(4);
        assertEquals("XL", nombreRomain.getValeur());
    }

    @Test
    public void testNombreCinquante(){
        nombreRomain.convertirCinquanteQuatreVingtDix(5);
        assertEquals("L", nombreRomain.getValeur());
    }

    @Test
    public void testNombreSoixanteDix(){
        nombreRomain.convertirCinquanteQuatreVingtDix(7);
        assertEquals("LXX", nombreRomain.getValeur());
    }

    @Test
    public void testNombreQuatreVingtDix(){
        nombreRomain.convertirCinquanteQuatreVingtDix(9);
        assertEquals("XC", nombreRomain.getValeur());
    }

    @Test
    public void testNombreCent(){
        nombreRomain.convertirCentQuantreCent(1);
        assertEquals("C", nombreRomain.getValeur());
    }

    @Test
    public void testNombreDeuxCent(){
        nombreRomain.convertirCentQuantreCent(2);
        assertEquals("CC", nombreRomain.getValeur());
    }

    @Test
    public void testNombreQuatreCent(){
        nombreRomain.convertirCentQuantreCent(4);
        assertEquals("CD", nombreRomain.getValeur());
    }

    @Test
    public void testNombreCinqCent(){
        nombreRomain.convertirCinqCentNeufCent(5);
        assertEquals("D", nombreRomain.getValeur());
    }

    @Test
    public void testNombreSeptCent(){
        nombreRomain.convertirCinqCentNeufCent(7);
        assertEquals("DCC", nombreRomain.getValeur());
    }

    @Test
    public void testNombreNeufCent(){
        nombreRomain.convertirCinqCentNeufCent(9);
        assertEquals("CM", nombreRomain.getValeur());
    }

    public void testNombreTroisMille(){
        nombreRomain.convertirMille(3);
        assertEquals("MMM", nombreRomain.getValeur());
    }

}