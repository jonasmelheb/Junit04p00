package org.exercice1;

public class Operation {
    /**
     * Faire la division
     * @param a entier1
     * @param b entier 2
     * @return double
     */
    public double div(double a, double b) throws Exception {
        if (b == 0)
            throw new Exception("Division par zéro");
        return a / b;
    }
}
