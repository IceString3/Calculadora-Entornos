package com.danny;

public class Resta extends Operacion{

    private double subtract;

    public Resta(double n1, double n2) {

        super(n1, n2, '-');
        this.subtract = n1 - n2;
        this.setRes(this.subtract);
    }
}
