package com.danny;

public class Division extends Operacion{

    private double div = 0;

    public Division(double n1, double n2) {

        super(n1, n2, '/');
        if (n2==0) {
            throw new IllegalArgumentException ("No se puede dividir entre cero");
        }
        else {
            this.div = n1 / n2;
            this.setRes(this.div);
        }
    }
}
