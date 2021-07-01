package org.gestionpersonnes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static  Integer division(Integer dividende, Integer diviseur) throws Exception{
        if(diviseur == 0) {
            throw new Exception("Diviseur à zéro");
        }
        return dividende/diviseur;
    }
}
