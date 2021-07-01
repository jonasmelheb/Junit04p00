package org.exercice2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void levenshteinDistanceOne() throws Exception {
        int result = StringUtils.levenshteinDistance("jva", "java");

        assertEquals(1, result);
    }

    @Test
    public void levenshteinDistanceTwo() throws Exception {
        int result = StringUtils.levenshteinDistance("distance", "instance");

        assertEquals(2, result);
    }

    @Test
    public void levenshteinDistanceThree() throws Exception {
        int result = StringUtils.levenshteinDistance("chien", "chine");

        assertEquals(2, result);
    }

    @Test
    public void levenshteinDistanceFour() throws Exception {
        int result = StringUtils.levenshteinDistance("chat", "chats");

        assertEquals(1, result);
    }

    @Test
    public void levenshteinDistanceNull() {
        try {
            int result = StringUtils.levenshteinDistance(null, null);
            fail("Exception non gérée");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("L'objet ne peut etre null"));
        }
    }

    @Test(expected = Exception.class)
    public void levenshteinDistanceNull2() throws Exception {
        int result = StringUtils.levenshteinDistance("jva", null);
    }
}