package org.exercice1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void testDiv() throws Exception {
        Operation op = new Operation();
        double resultat = op.div(3.0, 2.0);

        assertEquals(1,resultat,1);
    }
    @Test
    public void testDiv2() {
        Operation op = new Operation();
        try {
            double resultat = op.div(3.0, 0.0);
            fail("Exception non gérée");
        }
        catch(Exception e)
        {
            assertThat(e.getMessage(),is("Division par zéro"));
        }
    }

    @Test(expected=Exception.class)
    public void testDiv3() throws  Exception {
        Operation op = new Operation();
        double resultat = op.div(3, 0);
    }
}