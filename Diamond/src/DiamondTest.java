import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;

public class DiamondTest extends TestCase {
    private int nbLetters = 0;
    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    Diamond diamond = new Diamond();


    @Test
    public void testGetIndexLettreF() {
        assertEquals(6, diamond.getIndex('F'));
    }

    @Test
    public void testDiamantA() {
        assertEquals("A", diamond.writeDiamond(diamond.getIndex('A'), 'A'));
    }

    @Test
    public void testDiamantF() {
        String expected = "  A\n" +
                " B B\n" +
                "C   C\n" +
                " B B\n" +
                "  A";
        assertEquals(expected, diamond.writeDiamond(diamond.getIndex('C'), 'C'));
    }
}



