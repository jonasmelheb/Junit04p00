package org.gestionpersonnes;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de Test Junit 4 : TestPersonne
 * @author  Christophe Germain
 * @version  1.0
 */
public class TestPersonne {
    /**
     * Variable Globale d'une instance de Personne
     */
    private Personne testpersonne  = null;
    private final String nom = "GERMAIN";
    private final String prenom = "Christophe";
    private final String adresse = "rue principale";
    private final String ville = "agen";
    private final String cdpstd = "47000";
    private final String cdpshort = "4700";
    private final String cdpfalse = "A4700";

    /**
     * Méthode d'initialisation de la variable testpersonne pour
     * chaque test.
     */
    @Before
    public void setup() {
        testpersonne = new Personne(nom,prenom,adresse,ville,cdpstd);
    }

    /**
     * Test 1 : est ce que la personne est instanciée
     */
    @Test
    public void instancePersonne() {
        assertNotNull(testpersonne);
    }
    /**
     * Test 1 : est ce que la personne est instanciée
     * Test 2 : est ce que les getters sont différents de null (?? assert ....??)
     * Test 3 : est ce que le toString est cohérent
     * Test 4 : est ce que la CtrlCodePostal(String cp) fonctionne bien quand on lui met 5 caractères numériques ?
     * Test 5 : est ce que la CtrlCodePostal(String cp) renvoie bien une exception quand on lui donne moins de 5 caractéres numériques ?
     * Test 6 : est ce que la CtrlCodePostal(String cp) renvoie bien une exception quand on lui donne 5 caractéres non numériques ?
     * test 7 : tester un setter (nom par exemple) avec une valeur à NULL et de vérifier qu'on a bien une valeur à NULL en retour.
     */

    @Test
    public void testgetterNotNull() {
        assertNotNull(testpersonne.getNom());
        assertNotNull(testpersonne.getPrenom());
        assertNotNull(testpersonne.getVille());
    }

    @Test
    public void testToString() {
        /**
         * Personne.class.getSimpleName() = "Personne"
         */
        String tostring = Personne.class.getSimpleName()+" [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
                + ", codepostal=" + cdpstd + "]";
        assertEquals(tostring,testpersonne.toString());
    }

    @Test
    public void testCdpStd() {
        try {
            Personne.CtrlCodePostal(cdpstd);
            assertTrue(true); //TEST OK
        }
        catch(Exception e) {
            //assertFalse(true); //TEST KO
            //assertTrue(false); //TEST KO
            fail(); //TEST KO

        }
    }

    @Test(expected = Exception.class)
    public void testCdpShort() throws  Exception{

            Personne.CtrlCodePostal(cdpshort);

    }

    /**
     * JE teste que c'est bien une exception et aussi le retour du message de
     * l'exception = "Il faut saisir uniquement des chiffres"
     */
    @Test
    public void testCdpFalse() {
        try {
            Personne.CtrlCodePostal(cdpfalse);
        }
        catch(Exception e) {
            assertEquals(e.getMessage(),"Il faut saisir uniquement des chiffres");
        }

    }

    /**
     * Test du setter à NULL
     */

    @Test
    public void testSetterNull() {
        testpersonne.setAdresse(null);
        assertNull(testpersonne.getAdresse());
        testpersonne.setVille(null);
        assertNull(testpersonne.getVille());
        testpersonne.setCodepostal(null);
        assertNull(testpersonne.getCodepostal());

    }

}
