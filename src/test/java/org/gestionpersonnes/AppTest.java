package org.gestionpersonnes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test(expected = Exception.class)
    public void testdivisionNull() throws Exception {
        App.division(10, 0);

    }

    @Test
    public void testdivisionNull2() {
        try {
            App.division(10, 0);
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Diviseur à zéro"));
        }

    }

    @Test
    public void testdivision() throws Exception {

        assertEquals(App.division(10, 10).intValue(), 1);
    }
}
