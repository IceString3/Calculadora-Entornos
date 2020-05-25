package com.danny;

public class Suma extends Operacion{

    private double sum;

    public Suma(double n1, double n2) {

        super(n1, n2, '+');
        this.sum = n1 + n2;
        this.setRes(this.sum);
    }
}