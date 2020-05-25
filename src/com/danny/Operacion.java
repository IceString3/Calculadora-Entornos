package com.danny;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacion {

    Logger logger = Logger.getLogger(Operacion.class.getName());

    private double n1;
    private double n2;
    private double res;
    private char operacion;


    public Operacion(double n1, double n2, char operacion) {

        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }


    public void mostrarResultado(){
        logger.log (Level.INFO, "{0} {1} {2} = {3} ", new Object[]{n1, operacion, n2, res});
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}